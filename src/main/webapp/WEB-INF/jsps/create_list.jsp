<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All List</title>
</head>
<body>
<h2>List All</h2>
<table border="3">
<tr>
<th>Customer Name</th>
<th>Customer LastName</th>
<th>Customer Email</th>
<th>Customer Mobile_Number</th>
<th>Actions</th>
<th>Actions</th>
</tr>
 <c:forEach var="list" items="${lists}">
    <tr>
    <td>${list.name}</td>
     <td>${list.lname}</td>
      <td>${list.email}</td>
       <td>${list.mobile}</td>
       <td><a href="delete?id=${list.id}">delete</a></td>
       <td><a href="update?id=${list.id}">update</a></td>
       
    </tr>
    </c:forEach>
</table>
</body>
</html>