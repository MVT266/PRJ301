<%-- 
    Document   : display
    Created on : Jun 7, 2022, 1:31:52 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<body style="background-image: url(./img/7d9967ede8202b7e7231.jpg);">-->
<!DOCTYPE html>
<html>
    <head>
        <title>time table</title>
    </head>
    <body >
        <a class="container-fluid" href="home">Home</a>  
        <a href="login">Sign out</a>
        <br/>
        <div class="container">
            <div class="small" >

                Chú thích: Các hoạt động trong bảng dưới không bao gồm hoạt động ngoại khóa, ví dụ như hoạt động câu lạc bộ ...<br/>

                Các phòng bắt đầu bằng AL thuộc tòa nhà Alpha. VD: AL...<br/>
                Các phòng bắt đầu bằng BE thuộc tòa nhà Beta. VD: BE,..<br/>
                Các phòng bắt đầu bằng G thuộc tòa nhà Gamma. VD: G201,...<br/>
                Các phòng tập bằng đầu bằng R thuộc khu vực sân tập Vovinam.<br/>
                Các phòng bắt đầu bằng DE thuộc tòa nhà Delta. VD: DE,..<br/>
                Little UK (LUK) thuộc tầng 5 tòa nhà Delta
            </div>
        </div>
        <H1><FONT COLOR="DARKCYAN"><CENTER>COLLEGE TIME TABLE</FONT></H1>
        <table border="2" cellspacing="3" align="center">
            <tr>
                <td align="center">
                <td>7:30-9:00
                <td>9:10-10:40
                <td>10:50-12h20
                <td>12:20-12:50
                <td>12:50-14:20
                <td>14:30-16:00
                <td>16:00-17:40
                <td>17:40-19:00
            </tr>
            <tr>
                <td align="center">MONDAY
                <td align="center"><font color="blue">DGT301<br>
                <td align="center"><font color="pink">AIL302<br>
                <td align="center"><font color="red">SWE202<br>
                <td rowspan="6"align="center">L<br>U<br>N<br>C<br>H
                <td align="center"><font color="maroon">Empty<br>
                <td align="center"><font color="brown">Empty<br>
                <td align="center">counselling class
            </tr>
            <tr>
                <td align="center">TUESDAY
                <td align="center"><font color="blue">AIL302m<br>
                <td align="center"><font color="red">PRJ301<br>
                <td align="center"><font color="pink">PRJ301<br>
                <td align="center"><font color="orange">Empty<BR>
                <td align="center"><font color="maroon">EMPTY<br>
                <td align="center">library
            </tr>
            <tr>
                <td align="center">WEDNESDAY
                <td align="center"><font color="pink">Empty<br>
                <td align="center"><font color="orange">DGT301<BR>
                <td align="center"><font color="brown">PRM392<br>
                <td colspan="3" align="center"><font color="green"> lab
            </tr>
            <tr>
                <td align="center">THURSDAY
                <td align="center">AIL302m<br>
                <td align="center"><font color="brown">AIL302m<br>
                <td align="center"><font color="orange">PRJ301<BR>         
                <td align="center"><font color="blue">Empty<br>
                <td align="center"><font color="red">Empty<br>
                <td align="center">library
            </tr>
            <tr>
                <td align="center">FRIDAY
                <td align="center"><font color="orange">Empty<BR>
                <td align="center"><font color="maroon">DGT301<br>
                <td align="center"><font color="blue">PRM392<br>              
                <td align="center"><font color="pink">Empty<br>
                <td align="center"><font color="brown">Empty<br>
                <td align="center">library
            </tr>
            <tr>
                <td align="center">SATURDAY
                <td align="center"><font color="red">PRC391c<br>
                <td colspan="3" align="center">seminar
                <td align="center"><font color="pink">Empty<br>
                <td align="center"><font color="brown">Empty<br>
                <td align="center">library
            </tr>
    </body>
</html>