<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib  prefix="security" uri="http://www.springframework.org/security/tags" %>
<!doctype html>
<html lang="en">
<head>
	<title>Hello, world!</title>
</head>
<body>

	<h1>home page</h1>

	<!-- dispaly user name and role -->
	<p>
		User: <security:authentication property="principal.username" />
		<br><br>
		Role: <security:authentication property="principal.authorities" />
	</p>

	<security:authorize access="hasRole('ADMIN')">
		<p>
			<a href="${pageContext.request.contextPath}/systems">IT Systems Meeting</a>
			(Only for Admins)
		</p>
	</security:authorize>

	<security:authorize access="hasRole('MANAGER')">
		<p>
			<a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting</a>
			(Only for managers)
		</p>
	</security:authorize>

	<hr>

	<!-- Logout -->
	<form:form action="${pageContext.request.contextPath}/logout" method="post">
		<input type="submit" value="Logout" />
	</form:form>

</body>
</html>
