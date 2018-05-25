<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
	<title>Hello, world!</title>
</head>
<body>

	<h1>home page</h1>

	<form:form action="${pageContext.request.contextPath}/logout" method="post">
		<input type="submit" value="Logout" />
	</form:form>

</body>
</html>
