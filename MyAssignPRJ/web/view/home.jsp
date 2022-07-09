<%-- 
    Document   : Home
    Created on : Jun 17, 2022, 8:09:45 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<body style="background-image: url(./img/1-2-910x607.jpg);">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="alert alert-success text-center">
            <h1>FPT University Management</h1>
        </div>
        <nav>
            <ul>
                <li><a class="active" href="home">Home</a></li>
                <h5>Account: ${sessionScope.account.username}</h5>
                <li><a href="login">Sign out</a></li>
            </ul>

        </nav>


        <div>      
            <h3>Information Access(Tra cứu thông tin)</h3>
        </div>
        <div>     
            <a href="curriculum">Curriculum (Khung chương trình)</a>
            <a href="timetable">Weekly timetable(Thời khóa biểu từng tuần)</a><br>
            <a href="attendanceview">Attendance report(Báo cáo điểm danh)</a><br>
            <a href="markview">Mark Report (Báo cáo điểm)</a>

        </div>
    </body>
</html>
