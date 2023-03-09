<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="user" method="post">
<h1>${msg}</h1>
<h3>----User Form ------</h3>
<table>

<tr>
<td>Name :</td>
<td><input type="text" name="name" placeholder="Enter name here...">
</tr>

<tr>
<td>Email :</td>
<td><input type="email" name="email" placeholder="Enter Email here...">
</tr>

<tr>
<td>PhNo :</td>
<td><input type="number" name="phno" placeholder="Enter number here...">
</tr>

<tr>
<td><input type="submit" value="submit">
</tr>

</table>

</form>
</center>
</body>
</html>