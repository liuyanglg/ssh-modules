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
        <div class="table-responsive">
            <table id="user_table" class="table table-striped" data-url="user/queryUser.action">
                <thead></thead>
                <tr>
                    <th data-field="username">用户名</th>
                    <th data-field="sex">性别</th>
                    <th data-field="email">邮箱</th>
                    <th data-field="phone">手机</th>
                    <th data-field="userType">用户类型</th>
                </tr>
                </thead>
            </table>
        </div>
    </div>
</div>
</div>
</div>
</body>
</html>
<script type="text/javascript">
    $(document).ready(function () {
        console.log("bootstrap", "table-test");
//        $.ajax({
//            url: 'user/queryUser.action',
//            method: 'post',
//            success:function (data) {
//                $("#user_table").load(data.rows);
//            }
//        });
        $("#user_table").bootstrapTable({
            url: 'user/queryUser.action',
            method: 'post',
            columns: [{
                field: 'username',
                title: '用户名'
            }, {
                field: 'sex',
                title: '性别'
            }, {
                field: 'email',
                title: '邮箱'
            }, {
                field: 'phone',
                title: '手机'
            }, {
                field: 'userType',
                title: '用户类型'
            },]
        });

    });
</script>