<%-- 
    Document   : ResponseJSP
    Created on : 26/11/2018, 05:06:00 PM
    Author     : IsaacOff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String BTU = String.valueOf(request.getAttribute("ResultadoBTU")); 
String Muni = String.valueOf(request.getAttribute("Municipio")); 
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Los BTU que se necesitan son: <%=BTU%></h1>
        <h1>El municipio es: <%= Muni%></h1>
    </body>
</html>
