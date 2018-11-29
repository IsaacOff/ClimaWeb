<%-- 
    Document   : ResponseJSP
    Created on : 26/11/2018, 05:06:00 PM
    Author     : IsaacOff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%
String Result = String.valueOf(request.getAttribute("ResultadoBTU"));
String Muni = String.valueOf(request.getAttribute("Municipio"));
String total=String.valueOf(request.getAttribute("NumeroTotal"));
%>
<html>
    <head>
        <title>BTU</title>
    </head>
    <body>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> <!Para que acepte acentos>
        <form name="formulario1" method="post" >
                    
        <body style="background-color:LIGHTSKYBLUE;"> <!Color de fondo azul cadete>
        <!Logo FdeI><img src = "./Imagenes/FdeI.png" width="515" height="170">
        <!Logo UAC><img src = "./Imagenes/UAC.png" width="250" height="175">
        
                <center><h1>BTU's a utilizar: <%=Result%> </h1><br></center>
                <center><h1>El municipio con el que se calculo es: <%=Muni%> </h1><br></center>
                <center><h1>Climas</h1><br></center>

                <center><table class="egt4"></center>

            <tr>
            <!Encabezados en negrita con th>
    <th scope="row">Capacidad</th>
    <th>Marca</th>
    <th>Modelo</th>
    <th>Voltaje</th>
    <th>Corriente</th>
    <th>Refrigerante</th>
    <th>Potencia Eléctrica</th>
    <th>SEER</th>
            </tr>
            
<%
    int x=0;
while(Integer.parseInt(total)>x){
    System.out.println(total);
    System.out.println(x);
   out.println("<td>"+ request.getAttribute(Integer.toString(x))+"</td>");
   x++;
   out.println("<td>"+ request.getAttribute(Integer.toString(x))+"</td>");
   x++;
   out.println("<td>"+ request.getAttribute(Integer.toString(x))+"</td>");
   x++;
   out.println("<td>"+ request.getAttribute(Integer.toString(x))+"</td>");
   x++;
   out.println("<td>"+ request.getAttribute(Integer.toString(x))+"</td>");
   x++;
   out.println("<td>"+ request.getAttribute(Integer.toString(x))+"</td>");
   x++;
   out.println("<td>"+ request.getAttribute(Integer.toString(x))+"</td>");
   x++;
   out.println("<td>"+ request.getAttribute(Integer.toString(x))+"</td>");
   x++;
   out.println("</tr>");
}
%>   
                </table>

    </body>
</html>
