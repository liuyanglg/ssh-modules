<%@ page language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ include file="resources/public/jsp/quote.jsp" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>登录</title>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <link rel="icon" href="<%=request.getContextPath()%>/resources/public/img/icon.ico">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/module/login/css/animate.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/module/login/css/style.css">
</head>
<body>

<div class="container">
    <div class="row">
        <div id="user" class="col-md-4 col-md-offset-4">
            <form action="/login/login.action" class="fh5co-form animate-box" data-animate-effect="fadeIn">
                <h2>Sign In</h2>
                <div class="form-group">
                    <label for="module_login_username" class="sr-only">Username</label>
                    <input type="text" id="module_login_username" v-model="user.username" class="form-control"
                           name="user.username"
                           placeholder="Username"
                           autocomplete="off">
                </div>
                <div class="form-group">
                    <label for="module_login_password" class="sr-only">Password</label>
                    <input type="password" id="module_login_password" v-model="user.password" class="form-control"
                           name="user.password"
                           placeholder="Password" autocomplete="off">
                </div>
                <div class="form-group">
                    <label for="remember"><input type="checkbox" id="remember"> Remember Me</label>
                </div>
                <div class="form-group">
                    <label for="remember"> ${message}</label>
                </div>
                <div class="form-group">
                    <p>Not registered? <a href="sign-up.html">Sign Up</a> | <a href="forgot.html">Forgot Password?</a>
                    </p>
                </div>
                <div class="form-group">
                    <input type="submit" value="Sign In" class="btn btn-primary">
                </div>
            </form>
        </div>
    </div>
    <div class="row" style="padding-top: 60px; clear: both;">
        <div class="col-md-12 text-center">
            <p>
                <small>&copy; All Rights Reserved. More Templates
                    <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a>
                </small>
            </p>
        </div>
    </div>
</div>

<script src="<%=request.getContextPath()%>/resources/module/login/js/main.js"></script>
</body>
</html>

