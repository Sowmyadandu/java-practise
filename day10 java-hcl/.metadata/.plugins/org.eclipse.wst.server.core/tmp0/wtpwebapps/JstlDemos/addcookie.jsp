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
<body>
<%
Cookie ck1=new Cookie("sai","54");
ck1.setMaxAge(1000*24*60*60);
response.addCookie(ck1);

Cookie ck2=new Cookie("ram","63");
ck1.setMaxAge(1000*24*60*60);
response.addCookie(ck2);

Cookie ck3=new Cookie("yoy","54");
ck1.setMaxAge(1000*24*60*60);
response.addCookie(ck3);

out.println("cookie created...");

%>
</body>
</html>
