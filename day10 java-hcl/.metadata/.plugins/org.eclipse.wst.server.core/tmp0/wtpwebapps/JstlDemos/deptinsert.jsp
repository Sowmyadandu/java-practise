<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<sql:setDataSource var="conn"
driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3307/sqlpractice"
user="root"
password="root"
/>
<sql:update var="empUpdate" dataSource="${conn}">
Insert into department values(?,?,?,?,?)
<sql:param value="${param.deptno}"/>
<sql:param value="${param.dname}"/>
<sql:param value="${param.loc}"/>
<sql:param value="${param.city}"/>
<sql:param value="${param.head}"/>
</sql:update>
<c:out value="rec insert"/>
</body>
</html>