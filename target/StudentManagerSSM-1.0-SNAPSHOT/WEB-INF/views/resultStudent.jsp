<%--
  Created by IntelliJ IDEA.
  User: 72721
  Date: 2021/6/30
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">--%>
<%--    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-olOxEXxDwd20BlATUibkEnjPN3sVq2YWmYOnsMYutq7X8YcUdD6y/1I+f+ZOq/47" crossorigin="anonymous">--%>
    <title>Title</title>
</head>
<body style="background: url(../image/6.jpg) ">
<div style="text-align: center;margin: 0 auto">
    <table border="2" class="table-success">
        <tr>
        <td>学号</td>
        <td>名字</td>
        <td>年龄</td>
        <td>性别</td>
        </tr>
        <tr>
            <td>${student.student_id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.sex}</td>
        </tr>
    </table>
</div>
</body>
</html>
