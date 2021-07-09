<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <title>登录</title>
    <link rel="stylesheet" href="css/login.css"/>
    <link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
</head>
<body>
<ul class="nav nav-pills nav-fill">
    <li class="nav-item">
        <a class="nav-link active" href="#">主页</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="#">注册</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="#">登录</a>
    </li>
    <li class="nav-item">
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">帮助</a>
    </li>
</ul>
<div id="login-box">
    <h1>Login</h1>
    <form action="${pageContext.request.contextPath}/index" method="post">
    <div class="form">
        <div class="item">
            <i class="fa fa-github-alt" style="font-size:24px"></i>
            <input type="text" name="Username" placeholder="Username">
        </div>
        <div class="item">
            <i class="fa fa-search" style="font-size:24px"></i>
            <input type="text" name="Password" placeholder="Password">
        </div>
    </div>
    <br><input class="btn-danger" type="submit" value="教师登录">
    </form>
    </div>
    <div align="center"> <a href="/indexStudent" ><button type="button" class="btn-warning">学生登录</button></a></div>
</body>
</html>