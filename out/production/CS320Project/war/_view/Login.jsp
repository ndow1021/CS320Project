<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Login Screen</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		td.label {
			text-align: right;
		}
		</style>
	</head>

	<body>
		<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
	
		<form action="${pageContext.servletContext.contextPath}/LoginScreen" method="post">
			<table>
				<tr>
					<td class="label">Email</td>
					<td><input type="text" name="username" size="12" value="${email}" /></td>
				</tr>
				<tr>
					<td class="label">Password</td>
					<td><input type="text" name="second" size="12" value="${password}" /></td>
				</tr>

			</table>
			<input type="Submit" name="submit" value="Login">
		</form>
	</body>
</html>