<%-- Document : attendance report Created on : Jul 16, 2022, 7:54:39 PM Author : acer --%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <title>JSP Page</title>
    </head>

    <body>
        <form method="get" action="attendanceview">
            <p style="background-color:#e7741c; font-size: 22px"><a href="home"> Home </a> | View attendance</p>

            <h1>View attendance for ${sessionScope.account.user_name}</h1>
            <div style="padding-left: 20px; width:50px;float: left;">
                <table>
                    <tr>
                        <td style="font-size: 40px; color: #f5710c">CAMPUS</td>
                    </tr>
                    <tr>
                        <td>
                            <button type="button" class="btn btn-info">FU-HL</button>
                        </td>
                    </tr>
                </table>
            </div>
            <table summary='Select a course'>
                <thead>
                    <tr>
                        <th scope='col'>Campus/program</th>
                        <th scope='col'>Term</th>
                        <th scope='col'>Course</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td valign='top'>
                            <div id="ctl00_mainContent_divCampus">
                                <table>
                                    <tr>
                                        <td><b>FU-HL</b></td>
                                    </tr>
                                </table>
                            </div>
                        </td>
                        <td valign='top'>
                            <div id="ctl00_mainContent_divTerm">
                                <table>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=18">Summer2017</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=19">Fall2017</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=20">Spring2018</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=21">Summer2018</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=22">Fall2018</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=23">Spring2019</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=24">Summer2019</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=25">Fall2019</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=26">Spring2020</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=27">Summer2020</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=28">Fall2020</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=29">Spring2021</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=30">Summer2021</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=31">Fall2021</a></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=32">Spring2022</a></td>
                                    </tr>
                                    <tr>
                                        <td><b>Summer2022</b></td>
                                    </tr>
                                </table>
                            </div>
                        </td>
                        <td valign='top'>
                            <div id="ctl00_mainContent_divCourse">
                                <table>
                                    <tr>
                                        <td><b>Digital Signal Processing(DGT301)(AI1603,start 09/05/2022)</b></td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=33&course=24259">Mobile
                                                Programming(PRM392)</a>(IS1431,start 09/05/2022)</td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=33&course=24058">Java Web
                                                Application Development(PRJ301)</a>(SE1634,start 10/05/2022)</td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=33&course=24080">Machine
                                                Learning(AIL302m)</a>(AI1603,start 10/05/2022)</td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=33&course=24657">Writing Research
                                                Papers(ENW492c)</a>(MKT1502,start 21/05/2022)</td>
                                    </tr>
                                    <tr>
                                        <td><a href="?id=HE163714&campus=3&term=33&course=24639">Cloud
                                                Computing(PRC391c)</a>(AI1503-CPM,start 04/06/2022)</td>
                                    </tr>
                                </table>
                            </div>
                        </td>
                </tbody>
            </table>
        </td>

        <div id="ctl00_mainContent_divDetail">
            <td valign='top'>
                <h3>... then see report<br /><br /></h3>
                <table>
                    <tr>
                    <thead>
                    <th>No.</th>
                    <th>Date</th>
                    <th>Slot</th>
                    <th>Room</th>
                    <th>Lecturer</th>
                    <th>Group Name</th>
                    <th>Attedance status</th>
                    <th>Lecturer's comment</th>                                  
                    </thead>
                    </tr> 
                    <c:forEach items="${listAttends}" var="i">
                        <tr>   
                            <td><p>${i.Lession_id}</p></td>
                            <td><p style=" padding-right: 20px;">${r.date}</p></td>
                            <td><p>1</p></td>
                            <td><p>DE-C303</p></td>
                            <td><p>${i.Name}</p></td>
                            <td><p>${i.Group_Name}</p></td>
                            <td><p><input type="text" name="Comment" /></p></td>
                        </tr>              
                    </c:forEach>    
                </table>
            </td>               
        </div>                                                     
    </script>
</body>
</html>