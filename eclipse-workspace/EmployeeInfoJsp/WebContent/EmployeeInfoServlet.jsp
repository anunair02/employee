<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="EmployeeInfo" method="get">

First Name <input type="text" name=first><br>
Last Name <input type="text" name=last><br>

Select Country 
<select name="country">
		<option>Select</option>
		<option>Australia</option>
		<option>France</option>
		<option>Germany</option>
		<option>India</option>
		<option>United Kingdom</option>
		<option>United States of America</option>	
	</select>
	<br>
	
	<input type="checkbox" name="favoriteLanguage" value="Java"> Java

	<input type="checkbox" name="favoriteLanguage" value="C"> C

	<input type="checkbox" name="favoriteLanguage" value="PHP"> PHP

	<input type="checkbox" name="favoriteLanguage" value="Ruby"> Ruby

	<br/><br/>
	
<input type="submit" value=submit>

</form>

</body>
</html>