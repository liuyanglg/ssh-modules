<%@ page language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ include file="resources/public/jsp/quote.jsp" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <link rel="icon" href="/resources/public/img/icon.ico">
    <link href="/resources/module/login/css/signin.css" rel="stylesheet">
    <title>登录</title>
</head>

<body>
<div id="user" class="container">
    <form class="form-signin" action="login/userLogin.action">
        <h2 class="form-signin-heading">登录</h2>
        <label for="module_login_username" class="sr-only">username</label>
        <input type="text" id="module_login_username" v-model="username" name="user.username" class="form-control"
               placeholder="用户名"
               required autofocus>
        <label for="module_login_password" class="sr-only">password</label>
        <input type="password" id="module_login_password" v-model="password" name="user.password" class="form-control"
               placeholder="密码"
               required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 保持登录
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
        <%--<button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>--%>
    </form>
</div>

</body>
<script type="application/javascript">
    var user = new Vue({
        el: '#user',
        data: {
            username: '',
            password: '',
        },
        methods: {
            login: function () {
                axios({
                    method: 'post',
                    url: 'login/userLogin.action',
                    params: {
                        'user.username': this.username,
                        'user.password': this.password
                    }
                });
            }
        }
    })
</script>
</html>