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
        
                <center><h1>BTU's a utilizar: <% String.valueOf(request.getAttribute("ResultadoBTU"));%></h1><br></center>
                <center><h1>El municipio con el que se calculo es: <% String Muni = String.valueOf(request.getAttribute("Municipio"));%></h1><br></center>
                <center><h1>Climas</h1><br></center>

                <center><table class="egt4"></center>

            <tr>
            <!Encabezados en negrita con th>
    <th scope="row">Capacidad (BTU/h)</th>
    <th>Marca</th>
    <th>Modelo</th>
    <th>Voltaje</th>
    <th>Corriente</th>
    <th>Refrigerante</th>
    <th>Potencia Eléctrica (W)</th>
    <th>SEER</th>
            </tr>
            
            <tr>
                <! fila 1 >
    <td><input type="text" name="1" ></td>
    <td><input type="text" name="2" ></td>
    <td><input type="text" name="3" ></td>
    <td><input type="text" name="4" ></td>
    <td><input type="text" name="5" ></td>
    <td><input type="text" name="6" ></td>
    <td><input type="text" name="7" ></td>
    <td><input type="text" name="8" ></td>
            </tr>
            
            <tr>
                <! fila 2 >
    <td><input type="text" name="9" ></td>
    <td><input type="text" name="10" ></td>
    <td><input type="text" name="11" ></td>
    <td><input type="text" name="12" ></td>
    <td><input type="text" name="13" ></td>
    <td><input type="text" name="14" ></td>
    <td><input type="text" name="15" ></td>
    <td><input type="text" name="16" ></td>
            </tr>
            
            <tr>
                <! fila 3 >
    <td><input type="text" name="17" ></td>
    <td><input type="text" name="18" ></td>
    <td><input type="text" name="19" ></td>
    <td><input type="text" name="20" ></td>
    <td><input type="text" name="21" ></td>
    <td><input type="text" name="22" ></td>
    <td><input type="text" name="23" ></td>
    <td><input type="text" name="24" ></td>
            </tr>            

            <tr>
                <! fila 4 >
    <td><input type="text" name="25" ></td>
    <td><input type="text" name="26" ></td>
    <td><input type="text" name="27" ></td>
    <td><input type="text" name="28" ></td>
    <td><input type="text" name="29" ></td>
    <td><input type="text" name="30" ></td>
    <td><input type="text" name="31" ></td>
    <td><input type="text" name="32" ></td>
            </tr>       
            
            <tr>
                <! fila 5 >
    <td><input type="text" name="33" ></td>
    <td><input type="text" name="34" ></td>
    <td><input type="text" name="35" ></td>
    <td><input type="text" name="36" ></td>
    <td><input type="text" name="37" ></td>
    <td><input type="text" name="38" ></td>
    <td><input type="text" name="39" ></td>
    <td><input type="text" name="40" ></td>
            </tr>     

            <tr>
                <! fila 6 >
    <td><input type="text" name="41" ></td>
    <td><input type="text" name="42" ></td>
    <td><input type="text" name="43" ></td>
    <td><input type="text" name="44" ></td>
    <td><input type="text" name="45" ></td>
    <td><input type="text" name="46" ></td>
    <td><input type="text" name="47" ></td>
    <td><input type="text" name="48" ></td>
            </tr>        
            
            <tr>
                <! fila 7 >
    <td><input type="text" name="49" ></td>
    <td><input type="text" name="50" ></td>
    <td><input type="text" name="51" ></td>
    <td><input type="text" name="52" ></td>
    <td><input type="text" name="53" ></td>
    <td><input type="text" name="54" ></td>
    <td><input type="text" name="55" ></td>
    <td><input type="text" name="56" ></td>
            </tr>        
            
            <tr>
                <! fila 8 >
    <td><input type="text" name="57" ></td>
    <td><input type="text" name="58" ></td>
    <td><input type="text" name="59" ></td>
    <td><input type="text" name="60" ></td>
    <td><input type="text" name="61" ></td>
    <td><input type="text" name="62" ></td>
    <td><input type="text" name="63" ></td>
    <td><input type="text" name="64" ></td>
            </tr>    

            <tr>
                <! fila 9 >
    <td><input type="text" name="65" ></td>
    <td><input type="text" name="66" ></td>
    <td><input type="text" name="67" ></td>
    <td><input type="text" name="68" ></td>
    <td><input type="text" name="69" ></td>
    <td><input type="text" name="70" ></td>
    <td><input type="text" name="71" ></td>
    <td><input type="text" name="72" ></td>
            </tr>            
            
            <tr>
                <! fila 10 >
    <td><input type="text" name="73" ></td>
    <td><input type="text" name="74" ></td>
    <td><input type="text" name="75" ></td>
    <td><input type="text" name="76" ></td>
    <td><input type="text" name="77" ></td>
    <td><input type="text" name="78" ></td>
    <td><input type="text" name="79" ></td>
    <td><input type="text" name="80" ></td>
            </tr>            
                </table>

    </body>
</html>

