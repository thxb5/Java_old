<%@page import="jdbc.Emp"%>
<%@page import="jdbc.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<%
	EmpDao ed = EmpDao.getInstance();
	for(Emp emp : ed.selectAll()){
%>		
	<tr><td><%=emp.getEname() %></td>
	<td><a href="content.jsp?empno=<%=emp.getEmpno() %>"><%=emp.getEmpno()%></a></td>
	<td><%=emp.getJob() %></td>
	<td><%=emp.getDeptno() %></td>
	</tr>
<% } %>
</table>
</body>
</html>