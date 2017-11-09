<%@ page language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="/resources/public/img/icon.ico">

    <title>登录</title>

    <%--<!-- Bootstrap core CSS -->--%>
    <%--<link href="<%=basePath%>/resources/public/css/bootstrap.min.css" rel="stylesheet">--%>
    <%--<!-- Custom styles for this template -->--%>
    <%--<link href="<%=basePath%>/resources/module/login/css/signin.css" rel="stylesheet">--%>
    <%--<script src="<%=basePath%>/resources/module/login/js/main.js"></script>--%>

    <!-- Bootstrap core CSS -->
    <link href="resources/public/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/resources/module/login/css/signin.css" rel="stylesheet">
    <script src="/resources/module/login/js/main.js"></script>
</head>

<body>

<div class="container">

    <form class="form-signin">
        <h2 class="form-signin-heading">登录</h2>
        <label for="inputEmail" class="sr-only">username</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="用户名" required autofocus>
        <label for="inputPassword" class="sr-only">password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="密码" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 保持登录
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
        <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
    </form>

</div>


</body>
</html>