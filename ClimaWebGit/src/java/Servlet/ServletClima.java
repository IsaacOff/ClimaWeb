package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author IsaacOff
 */
public class ServletClima extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int var[]=new int[13];
        float respuesta[]=new float[16];
        int volumenResinto = 20;
        int personaDentroResinto = 600;
        int luzEquipoElectronico = 3;
        
        /*
        ap=Area de piso
        vdr=volumen del resinto
        vlsoe= Ventana lado sur o este
        vls= Ventana lado suroeste
        vlo= ventana lado oeste
        vlnos= ventana lado noreste o sureste
        arv= area del resto de las ventanas
        apu= area de la pared utilizada en el punto 3
        arpe= area del resto de las paredes exteriores
        atparna= area de todas las paredes adyacentes a un recinto no acondicionado
        tcc=techo con construccion sin acondicionar
        tcp= techo con plafon no aislado
        tcpa= techo con plafon con aislamiento
        tna= techo no aislado
        npar= numerp de personas dentro del resinto
        leens= luz y equipo electrico en uso
        */
        float apAncho, apFondo;
        float vdrAlto, vdrAncho, vdrFondo;
        float vlsoeAlto, vlsoeAncho;
        float vlsAlto, vlsAncho;
        float vloAlto, vloAncho;
        float vlnosAlto, vlnosAncho;
        float arvAlto, arvAncho;
        float apu, arpe, atparna;
        
        float tccAncho, tccFondo;
        float tcpAncho, tcpFondo;
        float tcpaAncho, tcpaFondo;
        float tnaAncho, tnaFondo;
        
        float npar,leens;
 
        //total de BTU para el clima
        float totalBTU=0;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletClima</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + request.getParameter("nombre") + "</h1> <br>");
            out.println("<h1>" + request.getParameter("correo") + "</h1><br>");
            out.println("<h1>" + request.getParameter("telefono") + "</h1><br>");
            out.println("<h1>" + request.getParameter("direccion") + "</h1><br>");
            out.println("<h1>" + request.getParameter("area") + "</h1><br>");
            out.println("<h1>" + request.getParameter("planta") + "</h1><br>");
            out.println("<h1>" + request.getParameter("fecha") + "</h1><br>");
            out.println("<h1>" + request.getParameter("cosa") + "</h1><br>");
            out.println("<h1>" + request.getParameter("opt") + "</h1><br>");
            out.println("</body>");
            out.println("</html>");
           */ 
        apAncho=Float.parseFloat(request.getParameter("1"));
        apFondo=Float.parseFloat(request.getParameter("2"));
        vdrAlto=Float.parseFloat(request.getParameter("3"));
        vdrAncho=Float.parseFloat(request.getParameter("4"));
        vdrFondo=Float.parseFloat(request.getParameter("5"));
        vlsoeAlto=Float.parseFloat(request.getParameter("6"));
        vlsoeAncho=Float.parseFloat(request.getParameter("7"));
        vlsAlto=Float.parseFloat(request.getParameter("8"));
        vlsAncho=Float.parseFloat(request.getParameter("9"));
        vloAlto=Float.parseFloat(request.getParameter("10"));
        vloAncho=Float.parseFloat(request.getParameter("11"));
        vlnosAlto=Float.parseFloat(request.getParameter("12"));
        vlnosAncho=Float.parseFloat(request.getParameter("13"));
        arvAlto=Float.parseFloat(request.getParameter("14"));
        arvAncho=Float.parseFloat(request.getParameter("15"));
        apu=Float.parseFloat(request.getParameter("16"));
        arpe=Float.parseFloat(request.getParameter("17"));
        atparna=Float.parseFloat(request.getParameter("18"));
        tccAncho=Float.parseFloat(request.getParameter("19"));
        tccFondo=Float.parseFloat(request.getParameter("20"));
        tcpAncho=Float.parseFloat(request.getParameter("21"));
        tcpFondo=Float.parseFloat(request.getParameter("22"));
        tcpaAncho=Float.parseFloat(request.getParameter("23"));
        tcpaFondo=Float.parseFloat(request.getParameter("24"));
        tnaAncho=Float.parseFloat(request.getParameter("25"));
        tnaFondo=Float.parseFloat(request.getParameter("26"));
        npar=Float.parseFloat(request.getParameter("27"));
        leens=Float.parseFloat(request.getParameter("28"));
            
            //String municipio = request.getParameter("opt");
            String municipio = "Campeche";

            
            //Temperatura exterior promedio anual °C son 32
            if ("Toluca".equals(municipio) || "Zacatecas".equals(municipio) ||
                "Tlaxcala".equals(municipio) || "Puebla".equals(municipio) ||
                "Morelia".equals(municipio) || "Actopan".equals(municipio) ||
                "Pachuca".equals(municipio) || "Cuernavaca".equals(municipio) ||
                "Cd. Mexico, Tacubaya".equals(municipio) || "Mazatlan".equals(municipio) ||
                "Comitan".equals(municipio) || "Cd. Mexico, Chapultepec".equals(municipio) ||
                "Guanajuato".equals(municipio)) {
            var[0]=24;
            var[1]=460;
            var[2]=840;
            var[3]=1140;
            var[4]=620;
            var[5]=120;
            var[6]=120;
            var[7]=68;
            var[8]=32;
            var[9]=24;
            var[10]=88;
            var[11]=32;
            var[12]=184;
                    }
            
            //Temperatura exterior promedio anual ∞C son 35
            if ( "Texcoco".equals(municipio) || "Jalapa".equals(municipio) ||
                    "Tulancingo".equals(municipio) ||"Zacapu".equals(municipio) ||
                    "Tenancingo".equals(municipio) ||"Chilpancingo".equals(municipio) ||
                    "San Juan del Rio".equals(municipio) ||"Durango".equals(municipio) ||
                    "Veracruz".equals(municipio) ||"Acapulco".equals(municipio) ||
                    "Cozumel".equals(municipio) ||"Guadalajara".equals(municipio) ||
                    "San Blas".equals(municipio) ||"Queretaro".equals(municipio) ||
                    "Ensenada".equals(municipio) ||"Leon".equals(municipio) ||
                    "Taxco".equals(municipio) ||"Uruapan".equals(municipio) ||
                    "Sombrerete".equals(municipio) ||"Ixtapa Zihuatanejo".equals(municipio) ||
                    "Aguascalientes".equals(municipio) ||"Salina Cruz".equals(municipio)) {
            var[0]=32;
            var[1]=480;
            var[2]=880;
            var[3]=1200;
            var[4]=660;
            var[5]=160;
            var[6]=144;
            var[7]=100;
            var[8]=44;
            var[9]=32;
            var[10]=108;
            var[11]=32;
            var[12]=212;    
                    }
            
            //Temperatura exterior promedio anual °C son 38
            if( "Ameca".equals(municipio) || 
                    "Campeche".equals(municipio) || "Cabo San Lucas".equals(municipio) ||
                    "La Piedad".equals(municipio) || "Tehuacan".equals(municipio) ||
                    "Cancun".equals(municipio) || "San Luis Potosi".equals(municipio) ||
                    "Tapachula".equals(municipio) ||"Zamora".equals(municipio) ||
                    "Rincon de Romos".equals(municipio) || "La Paz".equals(municipio) ||
                    "Saltillo".equals(municipio) || "Salvatierra".equals(municipio) ||
                    "Oaxaca".equals(municipio) || "Playa del Carmen".equals(municipio) ||
                    "Chetumal".equals(municipio) || "Tijuana".equals(municipio) ||
                    "Irapuato".equals(municipio) || "Tuxtla Gutierrez".equals(municipio) ||
                    "Chihuahua".equals(municipio) || "Manzanillo".equals(municipio) ||
                    "Progreso".equals(municipio) || "Tepic".equals(municipio) ||
                    "Ciudad Lerdo".equals(municipio) || "Puerto Vallarta".equals(municipio) ||
                    "Teziutlan".equals(municipio) || "Fresnillo".equals(municipio) ||
                    "Matamoros".equals(municipio) || "Tampico".equals(municipio) ||
                    "Colima".equals(municipio) || "Jerez de Garcia Salinas".equals(municipio)
                    || "Matehuala".equals(municipio)){
            var[0]=52;
            var[1]=540;
            var[2]=920;
            var[3]=1260;
            var[4]=700;
            var[5]=220;
            var[6]=180;
            var[7]=148;
            var[8]=68;
            var[9]=52;
            var[10]=140;
            var[11]=44;
            var[12]=236;
        }
            
            //Temperatura exterior promedio anual ∞C son 41
        if ( "Acaponeta".equals(municipio) || "Pochutla".equals(municipio) ||
                    "Poza Rica".equals(municipio) || "Valladolid".equals(municipio) ||
                    "Tuxpan".equals(municipio) || "Huauchinango".equals(municipio) ||
                    "Culiacan".equals(municipio) || "Ciudad del Carmen".equals(municipio) ||
                    "Ixmiquilpan".equals(municipio) || "Nogales".equals(municipio) ||
                    "Villahermosa".equals(municipio) || "Teapa".equals(municipio) ||
                    "Coatzacoalcos".equals(municipio) ||"Merida".equals(municipio) ||
                    "Topolobampo".equals(municipio) ||"RÌo Verde".equals(municipio) ||
                    "Celaya".equals(municipio) ||"Monterrey".equals(municipio) ||
                    "Campazos".equals(municipio) ||"Ciudad Victoria".equals(municipio) ||
                    "Mulege".equals(municipio) ||"Monclova".equals(municipio) ||
                    "Hidalgo del Parral".equals(municipio) ||"Santiago Papasquiaro".equals(municipio) ||
                    "Puente de Ixtla".equals(municipio) ||"Montemorelos".equals(municipio)) {
            var[0]=76;
            var[1]=600;
            var[2]=980;
            var[3]=1320;
            var[4]=760;
            var[5]=280;
            var[6]=200;
            var[7]=180;
            var[8]=84;
            var[9]=76;
            var[10]=160;
            var[11]=44;
            var[12]=264;    
        
        }
            //Temperatura exterior promedio anual °C son 43
            if ( "Ciudad Juarez".equals(municipio) || "Apatzingan".equals(municipio) ||
                    "Guamuchil".equals(municipio) || "Lagos de Moreno".equals(municipio) ||
                    "Piedras Negras".equals(municipio) || "Alvaro Obregon".equals(municipio) ||
                    "Nueva Rosita".equals(municipio) || "Torreon".equals(municipio) ||
                    "San Blas".equals(municipio) || "Hermosillo".equals(municipio) ||
                    "Navojoa".equals(municipio) || "Nuevo Laredo".equals(municipio) ||
                    "Reynosa".equals(municipio) || "Champoton".equals(municipio) ||
                    "Guaymas".equals(municipio) || "Altar".equals(municipio) ||
                    "El Fuerte".equals(municipio) || "Cuautla".equals(municipio) ||
                    "Mexicali".equals(municipio) || "Ciudad Obregon".equals(municipio) ||
                    "Ojinaga".equals(municipio)) {
            var[0]=100;
            var[1]=660;
            var[2]=1040;
            var[3]=1380;
            var[4]=820;
            var[5]=340;
            var[6]=228;
            var[7]=228;
            var[8]=100;
            var[9]=100;
            var[10]=180;
            var[11]=56;
            var[12]=288;
                    }
            
            respuesta[0]= apAncho*apFondo*var[0];
            respuesta[1]= vdrAncho*vdrAlto*vdrFondo*volumenResinto;
            respuesta[2]= vlsoeAlto*vlsoeAncho*var[1];
            respuesta[3]= vlsAlto*vlsAncho*var[2];
            respuesta[4]= vloAlto*vloAncho*var[3];
            respuesta[5]= vlnosAlto*vlnosAncho*var[4];
            respuesta[6]= arvAlto*arvAncho*var[5];
            respuesta[7]= apu*var[6];
            respuesta[8]= arpe*var[7];
            respuesta[9]= atparna*var[8];
            respuesta[10]= tccFondo*tccAncho*var[9];
            respuesta[11]= tcpFondo*tcpAncho*var[10];
            respuesta[12]= tcpaFondo*tcpaAncho*var[11];
            respuesta[13]= tnaFondo*tnaAncho*var[12];
            respuesta[14]= npar*personaDentroResinto;
            respuesta[15]= leens*luzEquipoElectronico;
            
            for(int x=0; x<16;x++){
                System.out.println(respuesta[x]);
                totalBTU=totalBTU+respuesta[x];
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletClima</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + request.getParameter("nombre") + "</h1> <br>");
            out.println("<h1>" + "El total de los BTU a utilizar es "+ totalBTU + "</h1> <br>");
            out.println("</body>");
            out.println("</html>");
            
        }  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
