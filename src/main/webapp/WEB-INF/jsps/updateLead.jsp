<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login Here...</h2>
<form action="updateLead" method="post">
<table>
<tr>
<td> <input type="hidden" name="id" value="${list.id}"/></td>
</tr>
<tr>
  <td>Customer Name</td>
<td><input type="text" name="name" value="${list.name}" /> </td>
</tr>
<tr>
  <td>Customer LastName</td>
<td><input type="text" name="lname" value="${list.lname}"/> </td>
</tr>
<tr>
  <td>Customer Email</td>
<td><input type="email" name="email" value="${list.email}"/> </td>
</tr>
<tr>
  <td>Customer MobileNumber</td>
<td><input type="number" name="mobile" value="${list.mobile}"/> </td>
</tr>
<tr>
<td><input type="submit" value="update"/></td>
</tr>
</table>
</form>
</body>
</html>