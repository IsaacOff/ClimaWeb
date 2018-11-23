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
        int volumenResinto = 20;
        int personaDentroResinto = 600;
        int luzEquipoElectronico = 3;
        /* 
            Area de piso
            Ventana lado sur o este
            Ventana lado suroeste
            ventana lado oeste
            ventana lada noreste o suroeste
            el resto de las ventanas
            Dimension de la pared
            Resto de las paredes exteriores
            Todas las paredes adyacentes
            techo con construccion
            techo con clafo
            techo con clafon y 50 mm
            Aislamiento
            Techado no aislado
            */
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
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
            
            String municipio = request.getParameter("opt");

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
