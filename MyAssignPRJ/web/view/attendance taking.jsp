<%-- 
    Document   : Attendance report
    Created on : Jun 14, 2022, 8:10:39 AM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Single Activity Attendance</title>
        <link rel="stylesheet" href="./css/detail.css">
    </head>

    <body>
        <div class="header">
            <h2>Single activity Attendance</h2>
            <p>Attendance for PRJ301 with Lecture Sonnt5 at slot 1 on Monday 31/01/2022 in room BE-301 at FU-HL</p>
            <table style="width:100%" id="schedule">
        </div>
        <nav class="homebutton">
            <a class="button" href="index.html">Home</a>
            <a class="button" href="#">Log out</a>
        </nav>
        <br>
        <div>
            <form action="attendancetaking" method="GET">
                <select name="class">
                    <c:forEach items="${listClass}" var="c">
                        <option                  
                            value="${c}" ${param['class']==c?'selected':''}>${c}</option>
                    </c:forEach>
                </select>
                <input type="submit" value="Save">
            </form>
            <form action="attendancetaking" method="post">
                <br>
                <table id="schedule">
                    <thead>
                    <th>No</th>
                    <th>Course_id</th>
                    <th>Student_id</th>
                    <th>Lastname</th>
                    <th>Status</th>
                    <th>Taker</th>
                    <th>Record time</th>
                    </thead>
                    <tbody>
                        <c:forEach items="${requestScope.listAttendance}" var="l" >
                            <tr >
                                <td>1</td>
                                <td>${l.course_id}</td>
                                <td><input type="hidden" name="studentid" value="${l.student_id}">${l.student_id}</td>
                                <td><input type="hidden" name="lessionid" value="${requestScope.lessionid}">${requestScope.lessionid}</td>
                                <td>${l.students.firstname} ${l.students.middlename} ${l.students.lastname}</td>
                                <td><input type="radio" name="status" value="1">Present
                                    <input type="radio" name="status" value="0">Absent
                                </td>
                                <td>${l.instructor_id}</td>
                                <td>1/31/2022</td>
                            </c:forEach>                         
                    </tbody>
                    <input type="submit" value="Update" />
                </table>
            </form>
    </body>
</html>
