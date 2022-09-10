<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <h1>Student List</h1>
        <h3>
            <a href="addstudentform">New Student</a>
        </h3>
        <table border="1">
 
            <th>Id</th>
            <th>Name</th>
            <th>Roll No</th>
            <th>Branch</th>
            <th>Address</th>
            <th>Action</th>
 
            <c:forEach var="Student" items="${listStudent}">
                <tr>
 
                   <td>${Student.id}</td>
                    <td>${Student.name}</td>
                    <td>${Student.rollno}</td>
                    <td>${Student.branch}</td>
                    <td>${Student.address}</td>
                    <td><a href="editStudent?id=${Student.id}">Edit</a>
                             <a
                        href="deleteStudent?id=${Student.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>