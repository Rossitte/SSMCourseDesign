<%--
  Created by IntelliJ IDEA.
  User: 72721
  Date: 2021/7/1
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="in">
    <title>Title</title>
    <style type="text/css">
        body{
            background: url("image/7.jpg") no-repeat;
            background-size:100% auto;
        }
    </style>
</head>
<body>
<div style="text-align: center;margin: fill">

    <form action="${pageContext.request.contextPath}/showresult" method="post">
   输入你的学号:<input type="text" name="idstudent">
        <button class="btn-info" type="submit" value="提交">提交</button>
    </form>
</div>
</body>
</html>
