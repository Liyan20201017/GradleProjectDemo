<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%--不让el忽略el表达式--%>
        <%@ page  isELIgnored="false"%>
        <%--引入jstl--%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>编号</td>
		<td>姓名</td>
		<td>密码</td>
	</tr>
	<c:forEach items="${user}" var="user" >
		<tr>
			<td>${user.id}</td>
			<td>${user.uname}</td>
			<td>${user.pwd}</td>
			<td><a href="delete?id=${user.id}">删除</a></td>
			<td><a href="showadd?id=${user.id}">修改</a></td>
	   </tr>
	</c:forEach>
</table>
</body>
</html>