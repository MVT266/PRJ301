<%-- 
    Document   : list
    Created on : May 19, 2022, 9:44:09 AM
    Author     : Ngo Tung Son
--%>

<<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!DOCTYPE html>
    <html>
        <body>
            <canvas id="4" width="500" height="500" style="border:1px solid #d3d3d3;">
                Your browser does not support the HTML5 canvas tag.</canvas>
            <script>
                var c = document.getElementById("4");
                var ctx = c.getContext("2d");
                <c:forEach items="${requestScope.rects}" var="r">
                ctx.beginPath();
                ctx.rect(${r.x}, ${r.y}, ${r.w}, ${r.h});
                ctx.stroke();
                </c:forEach>
            </script>
        </body>
    </html>
</body>
</html>

</body>
</html>
