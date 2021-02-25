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
	<form action="add"  method="post"  enctype="multipart/form-data">
		姓名：<input name="uname"  value="${user.uname}">	<input type="hidden" name="id" value="${user.id}"><br>
		密码：<input name="pwd"  value="${user.pwd}"><br>
		<input type="submit"><br>
	</form>
</body>
</html>