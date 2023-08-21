<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>VIEWING ALL CUSTOMERS .......</h1>
<br><br><br><br>
<table border="2px">
<thead>
	<tr>
			<th>Customer Id</th>
			<th>Customer Email</th>
			<th>Customer Password</th>
			<th>Customer PhoneNumber</th>
		<!-- 	<th>Address Id</th>
			<th>Address</th>
			<th>City</th>
			<th>Country</th>
			<th>Pincode</th>-->
			<th>Address</th>
			<th>Register On</th>  
			<th>Update</th>
			<th>Delete</th>
	</tr>
	</thead>
	<tbody>
		<c:forEach var="cus" items="${customer}">
			<tr>
				<td>${cus.customerId }</td>
				<td>${cus.customerEmail}</td>
				<td>${cus.customerPassword }</td>
				<td>${cus.customerPhoneNumber }</td>
				<td>${cus.address}</td>
				<td>${cus.registerOn }</td>
								
				<td>
					<a href="/update-customer/${cus.customerId}">Update</a>
				</td>
				<td>
					<a href="/delete-customer/${cus.customerId}">Delete</a>
				</td>	
			</tr>
		</c:forEach>
	</tbody>						
</table>
	<a href="/create-customer">Add Customer.</a>
</body>
</html>