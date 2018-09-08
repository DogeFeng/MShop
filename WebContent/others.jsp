<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://www.mldn.cn/c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/" ;
    request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
	<base href="<%=basePath%>">
	<title>微商城综合实战</title>
	<link type="text/css" rel="stylesheet" href="css/mldn.css">
	<script type="text/javascript" src="js/mldn.js"></script>
</head>
<body>

</body>
</html>