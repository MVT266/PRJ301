<%-- 
    Document   : Home
    Created on : Jun 17, 2022, 8:09:45 AM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link href="resources/Home.css" rel="stylesheet" type="text/css"/>

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
       
                <nav class="navMenu">
                    <a href="attendancerp">Attendance report(Báo cáo điểm danh)</a>
                    <a></a>
                    <a href="timetable">Weekly timetable(Thời khóa biểu từng tuần)</a>
                    <a></a>
                    <a href="attendancetaking">Attendance Taking(Lâý điểm danh)</a>
                    <a></a>
                    <a href="class">Class(Lớp)</a>
                    <div class="dot"></div>
                </nav>
  
<!--        <div class="background-one">
            <div class="link-container">
                <a class="link-one" href="attendancerp">Attendance report(Báo cáo điểm danh)</a>
            </div>
        </div>
        <div class="background-two link-container">
            <a class="link-two" href="timetable">Weekly timetable(Thời khóa biểu từng tuần)</a>
        </div>

        <div class="background-three link-container">
            <a class="link-three" href="attendancetaking">Attendance Taking(Lâý điểm danh)</a>
        </div>-->

    </body>
</html>
