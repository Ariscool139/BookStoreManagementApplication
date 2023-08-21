<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Customer SignUp </h1>
	<form:form action="save-cus" method="post" modelAttribute="customerformdata">
		<table>
			<tr>
				<td><form:label path="customerId">customer Id :</form:label>
				</td>
				<td><form:input type="number" path="customerId" /></td>
			</tr>
			<tr>
				<td><form:label path="customerEmail">customer Email :</form:label></td>
				<td><form:input type="email" path="customerEmail" /></td>
			</tr>
			<tr>
				<td><form:label path="customerPassword">customer Password :</form:label>
				</td>
				<td><form:input type="text" path="customerPassword" /></td>
			</tr>
			<tr>
				<td><form:label path="customerPhoneNumber">customer PhoneNumber :</form:label>
				</td>
				<td><form:input type="text" path="customerPhoneNumber" /></td>
			</tr>
			<tr>
				<td><form:label path="addressId">customer addressId :</form:label>
				</td>
				<td><form:input type="number" path="addressId" /></td>
			</tr>
			<tr>
				<td><form:label path="address">customer address :</form:label>
				</td>
				<td><form:input type="text" path="address" /></td>
			</tr>
			<tr>
				<td><form:label path="city">customer city :</form:label>
				</td>
				<td><form:input type="text" path="city" /></td>
			</tr>
			<tr>
				<td><form:label path="country">customer country :</form:label>
				</td>
				<td><form:input type="text" path="country" /></td>
			</tr>
			<tr>
				<td><form:label path="pincode">customer pincode :</form:label>
				</td>
				<td><form:input type="text" path="pincode" /></td>
			</tr>
			
			<tr>
				<td><form:label path="registerOn">registerOn :</form:label>
				</td>
				<td><form:input type="text" path="registerOn" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>