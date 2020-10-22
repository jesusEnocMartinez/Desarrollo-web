<%-- 
    Document   : sumajsp
    Created on : 22/10/2020, 12:09:20 AM
    Author     : enoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenidos</h1>
        <form action="calcservlet" method="post">
            <input type="text" name="t1">
            <input type="text" name="t2">
            <input type="submit" name="suma">
            </form>
    </body>
</html>