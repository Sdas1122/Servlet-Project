package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RailwayDAO {

	 ArrayList<RailwayDTO> getRailwayData() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<RailwayDTO> list = new ArrayList<RailwayDTO>();
		
		try {
			conn = ConnectionFactory.getDBConnection();
			String sql = "select * from RailwayBooking";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				RailwayDTO railway = new RailwayDTO();
				railway.setFstation(rs.getString("fromStarion"));
				railway.setTstation(rs.getString("toStation"));
				railway.setFirstName(rs.getString("firstName"));
				railway.setLastName(rs.getString("lastName"));
				railway.setAge(rs.getInt("age"));
				railway.setSex(rs.getString("sex"));
				railway.setPhno(rs.getInt("phoneno"));
				railway.setAdddress(rs.getString("address"));
				list.add(railway);
		} 
		}
			catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	
}
	
}
