<%-- 
    Document   : ResponseJSP
    Created on : 26/11/2018, 05:06:00 PM
    Author     : IsaacOff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String variable = String.valueOf(request.getAttribute("ResultadoBTU"));  
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! <%= variable%></h1>
    </body>
</html>
