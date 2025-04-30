package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoginDAO {

	ArrayList<LoginDTO> getLoginData() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();

		try {

			conn = ConnectionFactory.getDBConnection();
			String sql = "select * from login";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				LoginDTO lg = new LoginDTO();
				lg.setUname(rs.getString("username"));
				lg.setPassword(rs.getString("password"));
				list.add(lg);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return list;

	}

}
