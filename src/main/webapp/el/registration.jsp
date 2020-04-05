<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page !!!</title>
</head>
<body>
	<h1>Registration Form</h1>
	<form action="process-regitration.jsp" method="post">
		<table border="1px">
			<tr>
				<td><label>Name:</label></td>
				<td><input type="text" name="name"
					placeholder="Enter your name"></td>
			</tr>
			<tr>
				<td><label>Email:</label></td>
				<td><input type="email" name="email"
					placeholder="Enter your email"></td>
			</tr>
			<tr>
				<td><label>Age:</label></td>
				<td><input type="number" name="age"
					placeholder="Enter your age"></td>
			</tr>
			<tr>
				<td><label>Address:</label></td>
				<td><textarea name="address" rows="5" cols="50"></textarea></td>
			</tr>
			<tr>
				<td><label>Gender:</label></td>
				<td><input type="radio" name="gender" value="Male">
					Male &nbsp; <input type="radio" name="gender" value="Female">
					Female</td>
			</tr>
			<tr>
				<td><label>Courses:</label></td>
				<td><input type="checkbox" name="courses" value="M1">
					Core Java &nbsp; <input type="checkbox" name="courses" value="M2">
					Advance Java &nbsp; <input type="checkbox" name="courses"
					value="M3"> Java Frameworks</td>
			</tr>
			<tr>
				<td><label>Country:</label></td>
				<td><select name="country">
						<option value="">--Select--</option>
						<option value="IND">India</option>
						<option value="USA">America</option>
						<option value="AUS">Australia</option>
				</select></td>
			</tr>
			<tr>
				<td><label><input type="reset" value="Reset"></label></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>