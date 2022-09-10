<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <h1>New/Edit Student</h1>
        <form:form action="saveStudent" method="post" modelAttribute="student">
        <a href="listStudent"> view student</a>
        <table>
            <tr>
                <td>Id:</td>
                <td><form:input type="text" path="id" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input type="text" path="name" /></td>
            </tr>
            <tr>
                <td>Roll No:</td>
                <td><form:input type="text" path="rollno" /></td>
            </tr>
            <tr>
                <td>Branch:</td>
                <td><form:input type="text" path="branch" /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input type="text" path="address" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>