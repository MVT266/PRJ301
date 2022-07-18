<%-- 
    Document   : attendance view
    Created on : Jul 16, 2022, 6:56:30 PM
    Author     : acer
--%>

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
             <select name="class">
                    <c:forEach items="${listClass}" var="c">
                  <option                  
                        value="${c}" ${param['class']==c?'selected':''}>${c}</option>
                    </c:forEach>
                </select>
            <br>
            <form action="update" method="post">
                <table id="schedule">
                    <thead>
                    <th>No</th>
                    <th>Course_id</th>
                    <th>Student_id</th>
                    <th>Lastname</th>
                    <th>Image</th>
                    <th>Status</th>
                    <th>Comment</th>
                    <th>Taker</th>
                    <th>Record time</th>
                    </thead>
                    <tbody>
                        <c:forEach items="${requestScope.listAttendance}" var="l" >
                            <tr >
                                <td>1</td>
                                <td>${l.course_id}</td>
                                <td>${l.student_id}</td>
                                <td>${l.group_id}</td>
                                <td><img src="" alt="Image"></td>
                                <td>${sessionScope.account.user_name}</td>
                                <td>${l.dob}</td>
                            </c:forEach>     
                            
                        <<tr class="">
                            <td>2</td>
                            <td>PRJ301</td>
                            <td>HE15023</td>
                            <td>Nguyễn Hữu Toàn</td>
                            <td><img src="" alt="Image"></td>
                            <td><select name="Status">
                                    <option>Present</option>
                                    <option>Absent</option>
                                </select></td>
                            <td></td>
                            <td>sonnt5</td>
                            <td>1/31/2022</td>
                        </tr>

                        <tr class="">
                            <td>3</td>
                            <td>PRJ301</td>
                            <td>HE15043</td>
                            <td>Nguyễn Văn Toàn</td>
                            <td><img src="" alt="Image"></td>
                            <td><select name="Status">
                                    <option>Present</option>
                                    <option>Absent</option>
                                </select></td>
                            <td></td>
                            <td>sonnt5</td>
                            <td>1/31/2022</td>
                        </tr>

                        <tr class="">
                            <td>4</td>
                            <td>PRJ301</td>
                            <td>HE15090</td>
                            <td>Mai Hương Ly</td>
                            <td><img src="" alt="Image"></td>
                            <td><select name="Status">
                                    <option>Present</option>
                                    <option>Absent</option>
                                </select></td>
                            <td></td>
                            <td>sonnt5</td>
                            <td>1/31/2022</td>
                        </tr>

                        <tr class="">
                            <td>5</td>
                            <td>PRJ301</td>
                            <td>HE15098</td>
                            <td>Nguyễn Trung Hiếu</td>
                            <td><img src="" alt="Image"></td>
                            <td><select name="Status">
                                    <option>Present</option>
                                    <option>Absent</option>
                                </select></td>
                            <td></td>
                            <td>sonnt5</td>
                            <td>1/31/2022</td>
                        </tr>

                        <tr class="">
                            <td>6</td>
                            <td>PRJ301</td>
                            <td>HE15006</td>
                            <td>Bùi Thị Nở</td>
                            <td><img src="" alt="Image"></td>
                            <td><select name="Status">
                                    <option>Present</option>
                                    <option>Absent</option>
                                </select></td>
                            <td></td>
                            <td>sonnt5</td>
                            <td>1/31/2022</td>
                        </tr>

                        <tr class="">
                            <td>7</td>
                            <td>PRJ301</td>
                            <td>HE15009</td>
                            <td>Đỗ Mạnh Hùng</td>
                            <td><img src="" alt="Image"></td>
                            <td><select name="Status">
                                    <option>Present</option>
                                    <option>Absent</option>
                                </select></td>
                            <td></td>
                            <td>sonnt5</td>
                            <td>1/31/2022</td>
                        </tr>
                    <input type="submit" value="Save" />
                    </tbody>
                </table>
            </form>
    </body>
</html>
