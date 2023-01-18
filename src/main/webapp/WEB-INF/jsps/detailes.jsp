<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h2>Login Heree..</h2>
<form action="showController" method="post">
<table>
<tr>
  <td>Customer Name</td>
<td><input type="text" name="name"/> </td>
</tr>
<tr>
  <td>Customer LastName</td>
<td><input type="text" name="lname"/> </td>
</tr>
<tr>
  <td>Customer Email</td>
<td><input type="email" name="email"/> </td>
</tr>
<tr>
  <td>Customer MobileNumber</td>
<td><input type="number" name="mobile"/> </td>
</tr>
<tr>
<td><input type="submit" value="save"/></td>
</tr>
</table>
</form>
</body>
</html>