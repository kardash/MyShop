<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    </head>
    <body>
        <h3>Welcome!</h3>
        <form:form method="POST" action="login"  modelAttribute="users">
             <table>
                <tr>
                    <td><form:label path="userName">Username</form:label></td>
                    <td><form:input path="userName"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:password path="password"/></td>
                </tr>
                <tr>
                    
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>