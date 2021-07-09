<%--
  Created by IntelliJ IDEA.
  User: 72721
  Date: 2021/6/30
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生搜索</title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }

        body{
            width: 100vw;
            height: 100vh;
            /*background: radial-gradient(at center,*/
            /*#3498db,#2980b9);*/
            background: url("image/3.jpg") no-repeat;
            background-size:100% auto;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        div.search{
            height: 40px;
            width: 500px;
        }

        div.search form{
            width: 100%;
            height: 100%;
        }

        div.search form input:nth-child(2){
            width: 400px;
            height: 100%;
            font-size: 16px;
            text-indent: 40px;
            border: none;
            float: left;
        }

        div.search form input:nth-child(3){
            width: 100px;
            height: 100%;
            font-size: 16px;
            letter-spacing: 5px;
            border: none;
        }

        div.search form img{
            position: absolute;
            left: 50vw;
            transform: translateX(-250px);
            margin-top: 10px;
            margin-left: 10px;
            height: 20px;
        }
    </style>
</head>
<body>
<div class="search">
    <form action="${pageContext.request.contextPath}/seekStudent" method="post">
        <%--       输入学号<input type="text" name="student_id">--%>
        输入学号: <input type="text" name="student_id" id="student_id"
                     placeholder="请在这里输入学号">
        <input type="submit" value="查询">
    </form>
</div>
</body>
</html>
