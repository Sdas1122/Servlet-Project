<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Indian Railway</title>
</head>
<body>
	<form name="f1" method="post"
		action="/ServletWebProject/RailwayBServlet">
		<header>
			<h1 align="center">Welcome To Indian Railway</h1>
			<hr style="border: 1px solid black;">
		</header>
		<Section>
			<h2>Journey Information</h2>
			<table align="left">
				<tr>
					<td>From(station)</td>
					<td><input type="text" name="fstation"></td>
				</tr>
				<tr>
					<td>To(station)</td>
					<td><input type="text" name="Tstation"></td>
				</tr>
			</table>
		</Section>
		<br> <br> <br> <br>
		<Section>
			<h2>Passenger Information</h2>
			<table align="left">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName">
					<td>Last Name</td>
					<td><input type="text" name="lastName"></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="number" name="age"></td>
					<td>Sex</td>
					<td><input type="text" name="sex"></td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td><input type="number" name="phno"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="adddress"></td>
				</tr>

				<tr>
					<td><input type="submit" value="submit"></td>
					<td><input type="reset" value="Refresh"><a href="/ServletWebProject/RailwayShowDataServlet">Show all data</a>
				</tr>
			</table>
		</Section>
	</form>
</body>
</html>