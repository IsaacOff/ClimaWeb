<%-- 
    Document   : Index
    Created on : 27/11/2018, 06:01:23 PM
    Author     : IsaacOff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Interfaz de Climas JSP</title>
    </head>
    <body>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> <!Para que acepte acentos>
    <form name="formulario1" action="ServletClima" method="post" >

        <body style="background-color:LIGHTSKYBLUE;"> <!Color de fondo azul cadete>
        <!Logo FdeI><img src = "./Imagenes/FdeI.png" width="515" height="170">
        <!Logo UAC><img align="right" src = "./Imagenes/UAC.png" width="250" height="175">

        <center><h1>Favor de ingresar los datos de la empresa.</h1><br></center>

        <center>Nombre de la Empresa:<br></center>
        <center><input type="text" name="nombre" required><br></center>
        <br>

        <center>Correo:<br></center>
        <center><input type="email" name="correo" required><br></center>
        <br>

        <center>Teléfono:<br></center>
        <center><input type="text" name="telefono" required><br></center>
        <br>

        <center>Dirección:<br></center>
        <center><input type="text" name="direccion" required><br></center>
        <br>

        <center>ID Área Climatizada:<br></center>
        <center><input type="text" name="area" required><br></center>
        <br>

        <center>Planta:<br></center>
        <center><input type="text" name="planta" required><br></center>
        <br>

        <center>Fecha:<br></center>
        <center><input type="date" name="fecha" required><br></center>
        <br>


        <center><select class="seleccion" name="estado" onchange="cambia()"></center>
        <option value="0">Seleccione el Estado
        <option value="1">Aguascalientes
        <option value="2">Baja California Norte
        <option value="3">Baja California Sur
        <option value="4">Campeche
        <option value="5">Cd. de México
        <option value="6">Chiapas
        <option value="7">Chihuahua
        <option value="8">Coahuila
        <option value="9">Colima
        <option value="10">Durango
        <option value="11">Guanajuato
        <option value="12">Guerrero
        <option value="13">Hidalgo
        <option value="14">Jalisco
        <option value="15">México
        <option value="16">Michoacán
        <option value="17">Morelos
        <option value="18">Nayarit
        <option value="19">Nuevo León
        <option value="20">Oaxaca
        <option value="21">Puebla
        <option value="22">Querétaro
        <option value="23">Quintana Roo
        <option value="24">San Luis Potosí
        <option value="25">Sinaloa
        <option value="26">Sonora
        <option value="27">Tabasco
        <option value="28">Tamaulipas
        <option value="29">Tlaxcala
        <option value="30">Veracruz
        <option value="31">Yucatán
        <option value="32">Zacatecas
            </select>

        <select class="seleccion" name="opt">
            <option value="-">Seleccione el Municipio<br>
        </select>
    <br>
    <br>
    <center><h2>Favor de ingresar los siguientes datos (en metros).</h2><br></center>
    <center><th3>* Elegir sólo uno</th3></center>  
    
    <center><table class="egt"></center>
    <tr>    
        <th scope="row">Número</th>
        <th>Descripción</th>
        <th>Alto</th>
        <th>Ancho</th>
        <th>Fondo</th>
    </tr>

    <tr>
        <th>1</th>
        <td>Área del Piso</td>
        <td>N/A</td>
        <td><input type="text" name="1" required></td>
        <td><input type="text" name="2" required></td>
    </tr>

    <tr>
        <th>2</th>
        <td>Volumen del Recinto</td>
        <td><input type="text" name="3" required></td>
        <td><input type="text" name="4" required></td>
        <td><input type="text" name="5" required></td>
    </tr>

    <tr>
        <th></th>
    <center><th colspan="4">ÁREA DE VENTANA EXPUESTA AL SOL (Utilice la ventana que arroje el mayor resultado)</th></center>
</tr>

<tr>
    <th rowspan="4">3*</th>
    <td>Ventana Lado Sur o Este</td>
    <td><input type="text" name="6" value="0"></td>
    <td><input type="text" name="7" value="0"></td>
    <td>N/A</td>
</tr>

<tr>
    <td>Ventana Lado Suroeste</td>
    <td><input type="text" name="8" value="0"></td>
    <td><input type="text" name="9" value="0"></td>
    <td>N/A</td>
</tr>

<tr>
    <td>Ventana Lado Oeste</td>
    <td><input type="text" name="10" value="0"></td>
    <td><input type="text" name="11" value="0"></td>
    <td>N/A</td>
</tr>

<tr>
    <td>Ventana Noreste o Sureste</td>
    <td><input type="text" name="12" value="0"></td>
    <td><input type="text" name="13" value="0"></td>
    <td>N/A</td>
</tr>

<tr>
    <th>4</th>
    <td>Área del Resto de las Ventanas</td>
    <td><input type="text" name="14" required></td>
    <td><input type="text" name="15" required></td>
    <td>N/A</td>
</tr>

<tr>
    <th>5</th>
    <td>Área de la Pared Utilizada en el Punto 3 (no incluir dimensión de la ventana)</td>
    <td colspan="3"><input type="text" name="16" required></td>
</tr>

<tr>
    <th>6</th>
    <td>Área del Resto de las Paredes Exteriores (no incluir dimensión de la ventana)</td>
    <td colspan="3"><input type="text" name="17" required></td>
</tr>

<tr>
    <th>7</th>
    <td>Área de Todas las Paredes Adyacentes a un Recinto No Acondicionado</td>
    <td colspan="3"><input type="text" name="18" required></td>
</tr>

<tr>
    <th rowspan="4">8*</th>
    <td>Techo con Construcción Arriba Sin Acondicionar</td>
    <td>N/A</td>
    <td><input type="text" name="19" value="0"></td>
    <td><input type="text" name="20" value="0"</td>
</tr>

<tr>
    <td>Techo con Plafón No Aislado</td>
    <td>N/A</td>
    <td><input type="text" name="21" value="0"></td>
    <td><input type="text" name="22" value="0"></td>
</tr>

<tr>
    <td>Techado con Plafón y 50 mm. (2") o Más de Aislamiento</td>
    <td>N/A</td>
    <td><input type="text" name="23" value="0"></td>
    <td><input type="text" name="24" value="0"></td>
</tr>

<tr>
    <td>Techado No Aislado</td>
    <td>N/A</td>
    <td><input type="text" name="25" value="0"></td>
    <td><input type="text" name="26" value="0"></td>
</tr>

<tr>
    <th>9</th>
    <td>Número de Personas Dentro del Recinto</td>
    <td colspan="3"><input type="text" name="27" required></td>
</tr>

<tr>
    <th>10</th>
    <td>Luz y Equipos Eléctricos en Uso (WATTS)</td>
    <td colspan="3"><input type="text" name="28" required></td>
</tr>

</table>

<br>
<br><center><button type="submit"> Enviar </button>
<button type="reset"> Limpiar</button></center>
<br>
</form>
            </body>
            </html>
            <script type="text/javascript">
        //1) Definir Las Variables Correspondintes
        var opt_0 = new Array("Seleccione el Municipio");
        var opt_1 = new Array("Aguascalientes", "Rincon de Romos");
        var opt_2 = new Array("Ensenada", "Mexicali", "Tijuana");
        var opt_3 = new Array("Cabo San Lucas", "La Paz", "Mulege");
        var opt_4 = new Array("Campeche", "Champoton", "Ciudad del Carmen");
        var opt_5 = new Array("Cd. Mexico, Chapultepec", "Cd. Mexico, Tacubaya");
        var opt_6 = new Array("Comitan", "Tapachula", "Tuxtla Gutiérrez");
        var opt_7 = new Array("Chihuahua", "Ciudad Juarez", "Hidalgo de Parral", "Ojinaga");
        var opt_8 = new Array("Monclova", "Nueva Rosita", "Piedras Negras", "Saltilla", "Torreon");
        var opt_9 = new Array("Colima", "Manzanillo");
        var opt_10 = new Array("Ciudad Lerdo", "Durango", "Santiago Papasquiaro");
        var opt_11 = new Array("Celaya", "Guanajuato", "Irapuato", "Leon", "Salvatierra");
        var opt_12 = new Array("Acapulco", "Chilpancingo", "Ixtapa Zihuatanejo", "Taxco");
        var opt_13 = new Array("Actopan", "Ixmiquilpan", "Pachuca", "Tulancingo");
        var opt_14 = new Array("Ameca", "Guadalajara", "Lagos de Moreno", "Puerto Vallarta");
        var opt_15 = new Array("Tenancingo", "Texcoco", "Toluca");
        var opt_16 = new Array("Apatzingan", "La Piedad", "Morelia", "Uruapan", "Zacapu", "Zamora");
        var opt_17 = new Array("Cautla", "Cuernavaca", "Puente de Ixtla");
        var opt_18 = new Array("Acaponeta", "San Blas", "Tepic");
        var opt_19 = new Array("Campazos", "Montemorelos", "Monterrey");
        var opt_20 = new Array("Oaxaca", "Pochutla", "Salina Cruz");
        var opt_21 = new Array("Huauchinango", "Puebla", "Tehuacan", "Texiutlan");
        var opt_22 = new Array("Queretaro", "San Juan del Río");
        var opt_23 = new Array("Cancun", "Chetumal", "Cozumel", "Playa del Carmen");
        var opt_24 = new Array("Matehuala", "Rio Verde", "San Luis Potosi");
        var opt_25 = new Array("Culiacan", "El Fuerte", "Guamuchil", "Mazatlan", "San Blas", "Topolobampo");
        var opt_26 = new Array("Altar", "Ciudad Obregon", "Guaymas", "Hermosillo", "Novojoa", "Nogales");
        var opt_27 = new Array("Alvaro Obregon", "Teapa", "Villahermosa");
        var opt_28 = new Array("Ciudad Victoria", "Matamoros", "Nuevo Laredo", "Reynosa", "Tampico");
        var opt_29 = new Array("Tlaxcala");
        var opt_30 = new Array("Coatzacoalcos", "Jalapa", "Poza Rica", "Tuxpan", "Veracruz");
        var opt_31 = new Array("Merida", "Progreso", "Valladolid");
        var opt_32 = new Array("Fresnillo", "Jerez de Garcia Salinas", "Sombrerete", "Zacatecas");
        // 2) crear una funcion que permita ejecutar el cambio dinamico

        function cambia() {
            var estado;
            //Se toma el valor de la "cosa seleccionada"
            estado = document.formulario1.estado[document.formulario1.estado.selectedIndex].value;
            //se chequea si la "cosa" está definida
            if (estado !== 0) {
                //selecionamos las cosas Correctas
                mis_opts = eval("opt_" + estado);
                //se calcula el numero de cosas
                num_opts = mis_opts.length;
                //marco el numero de opt en el select
                document.formulario1.opt.length = num_opts;
                //para cada opt del array, la pongo en el select
                for (i = 0; i < num_opts; i++) {
                    document.formulario1.opt.options[i].value = mis_opts[i];
                    document.formulario1.opt.options[i].text = mis_opts[i];
                }
            } else {
                //si no había ninguna opt seleccionada, elimino las cosas del select
                document.formulario1.opt.length = 1;
                //ponemos un guion en la unica opt que he dejado
                document.formulario1.opt.options[0].value = "-";
                document.formulario1.opt.options[0].text = "-";
            }
            //hacer un reset de las opts
            document.formulario1.opt.options[0].selected = true;

        }
            </script>
