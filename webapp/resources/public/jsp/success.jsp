<%@ page language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ include file="/resources/public/jsp/quote.jsp" %>

<html>
<head>
    <title>登录</title>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <link rel="icon" href="<%=request.getContextPath()%>/resources/public/img/icon.ico">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/public/css/main.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="index-01.html">用户数据 <span class="sr-only">(current)</span></a>
                </li>
                <li><a href="index-01.html">子级菜单1</a></li>
                <li><a href="index-01.html">子级菜单2</a></li>
                <li><a href="index-01.html">子级菜单3</a></li>
            </ul>
            <ul class="nav nav-sidebar">
                <li><a href="index-01.html">其他菜单</a></li>
                <li><a href="index-01.html">子级菜单1</a></li>
                <li><a href="index-01.html">子级菜单1</a></li>
                <li><a href="index-01.html">子级菜单1</a></li>
                <li><a href="index-01.html">子级菜单1</a></li>
            </ul>
        </div>
    </div>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        <h1 class="page-header">用户数据</h1>
    </div>
</div>
</body>
</html>
