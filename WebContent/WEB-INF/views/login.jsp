<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form name="loginform" method="post" action="enter">
Enter the UserID:<input type="text" name="id"><br><br>
Enter the Password<input type="password" name="pw"><br><br>
<input type="submit" value="ENTER"><br><br>
New User Register:   <input type="submit" value="Register" onclick="document.loginform.action='register'" /><br><br>
ADMIN LOGIN :    <input type="submit" value="admin login" onclick="document.loginform.action='admin'" /><br><br>
<div style="color: red">${ms}</div>
</form:form>
</body>
</html>