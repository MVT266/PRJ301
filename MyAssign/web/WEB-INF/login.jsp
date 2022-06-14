<%-- 
    Document   : login
    Created on : Jun 5, 2022, 10:08:17 PM
    Author     : acer
--%>

<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>

        <div class="row">
            <div class="col-sm-4">
                <form method="POST" action="loginv.jsp">
                    <div align="left">
                        <label class="form-label">Username</label>
                        <input type="text" id="uname" name="uname" placeholder="Username" size="30px" required>

                    </div>
                    <div align="left">
                        <label class="form-label">Password</label>
                        <input type="text" id="uname" name="submit" placeholder="Password" size="30px" required>

                    </div>

                    <div align="left">
                        <input type="submit" id="submit" name="submit" value="submit">
                        <input type="reset" id="reset" name="reset" value="reset" class="btn btn-warning">

                    </div>
                </form>

            </div>

        </div>
    </body>
</html>
