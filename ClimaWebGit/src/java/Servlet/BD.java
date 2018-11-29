package Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;


   
       public class BD{
        
    private Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";//usuario
    private static final String password = "";//contraseña
    private static final String url = "jdbc:mysql://localhost:3306/clima_web_bd";//lugar donde esta ubicada la BD
    private String capacidad;
    private String marca;
    private String modelo;
    private String voltaje;
    private String corriente;
    private String refrigerante;
    private String potencia_electrica;
    private String seer;
    private static HttpServletRequest request;

    
    public void BD1(){

             //Conecta la base de datos
         conn = null;
        try {
            Class.forName(driver);
            //Nos conectamos a la base de datos
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Conexion establecida");
            }
        } catch (Exception e) {
            System.out.println("Error al coenctar" + e);
        }
 
            
        
    }
    
    
    
     public void consulta_12btus() throws SQLException{
        
        //Realiza una consulta
        String sql = "SELECT * FROM 12btus";
        Statement st;
        
       String [ ] BDprueba = new  String[13];
        try{
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
        
                    while (rs.next()){
                 
                     capacidad=String.valueOf(rs.getObject("capacidad"));
                     marca=String.valueOf(rs.getObject("marca"));
                     modelo=String.valueOf(rs.getObject("modelo"));
                     voltaje=String.valueOf(rs.getObject("voltaje"));
                     corriente=String.valueOf(rs.getObject("corriente"));
                     refrigerante=String.valueOf(rs.getObject("refrigerante"));
                     potencia_electrica=String.valueOf(rs.getObject("potencia_electrica"));
                     seer=String.valueOf(rs.getObject("seer"));
                     ServletClima.getDatos(request,capacidad, marca, modelo, voltaje, corriente, refrigerante, potencia_electrica, seer);
                     
                 /*
                     System.out.println(rs.getObject("marca"));
                     System.out.println(rs.getObject("modelo"));
                     System.out.println(rs.getObject("voltaje"));
                     System.out.println(rs.getObject("corriente"));
                     System.out.println(rs.getObject("refrigerante"));
                     System.out.println(rs.getObject("potencia_electrica"));
                     System.out.println(rs.getObject("seer"));
                     */
                    }
            rs.close();
            st.close();

            }catch(SQLException ex){
                    //Montar error en pantalla
            }
    }
     
     
     
    public void consulta_18btus() throws SQLException{
     
        //Realiza una consulta
        String sql = "SELECT * FROM 18btus";
        Statement st;
        
       String [ ] BDprueba = new  String[11];
        try{
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
        
                    while (rs.next()){
                 
                     
                     capacidad=String.valueOf(rs.getObject("capacidad"));
                     marca=String.valueOf(rs.getObject("marca"));
                     modelo=String.valueOf(rs.getObject("modelo"));
                     voltaje=String.valueOf(rs.getObject("voltaje"));
                     corriente=String.valueOf(rs.getObject("corriente"));
                     refrigerante=String.valueOf(rs.getObject("refrigerante"));
                     potencia_electrica=String.valueOf(rs.getObject("potencia_electrica"));
                     seer=String.valueOf(rs.getObject("seer"));
                     ServletClima.getDatos(request,capacidad, marca, modelo, voltaje, corriente, refrigerante, potencia_electrica, seer);
                     
                    }
            rs.close();
            st.close();

            }catch(SQLException ex){
                    //Montar error en pantalla
            }
    }
    
    
    
     public void consulta_24btus() throws SQLException{
        
         //Realiza una consulta
        String sql = "SELECT * FROM 24btus";
        Statement st;
        
       String [ ] BDprueba = new  String[3];
        try{
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
        
                    while (rs.next()){
                 
                     capacidad=String.valueOf(rs.getObject("capacidad"));
                     marca=String.valueOf(rs.getObject("marca"));
                     modelo=String.valueOf(rs.getObject("modelo"));
                     voltaje=String.valueOf(rs.getObject("voltaje"));
                     corriente=String.valueOf(rs.getObject("corriente"));
                     refrigerante=String.valueOf(rs.getObject("refrigerante"));
                     potencia_electrica=String.valueOf(rs.getObject("potencia_electrica"));
                     seer=String.valueOf(rs.getObject("seer"));
                     ServletClima.getDatos(request,capacidad, marca, modelo, voltaje, corriente, refrigerante, potencia_electrica, seer);
                    }
            rs.close();
            st.close();

            }catch(SQLException ex){
                    //Montar error en pantalla
            }
    }
     
     
     
     
     public void consulta_36btus() throws SQLException{
      
         //Realiza una consulta
        String sql = "SELECT * FROM 36btus";
        Statement st;
        
       String [ ] BDprueba = new  String[5];
        try{
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
        
                    while (rs.next()){
                 
                     capacidad=String.valueOf(rs.getObject("capacidad"));
                     marca=String.valueOf(rs.getObject("marca"));
                     modelo=String.valueOf(rs.getObject("modelo"));
                     voltaje=String.valueOf(rs.getObject("voltaje"));
                     corriente=String.valueOf(rs.getObject("corriente"));
                     refrigerante=String.valueOf(rs.getObject("refrigerante"));
                     potencia_electrica=String.valueOf(rs.getObject("potencia_electrica"));
                     seer=String.valueOf(rs.getObject("seer"));
                     ServletClima.getDatos(request,capacidad, marca, modelo, voltaje, corriente, refrigerante, potencia_electrica, seer);
                    
           /*      out.println("<tr>");
                 out.println("<td>"+rs.getObject("id")+"</td>");
                 out.println("<td>"+rs.getObject("nombre")+"</td>");
                 out.println("<td>"+rs.getObject("apellidos")+"</td>");
                 out.println("<td>"+rs.getObject("telefono")+"</td>");
                 out.println("</tr>");*/
                    }
            rs.close();
            st.close();

            }catch(SQLException ex){
                    System.out.println("error");
            }
    }
     
     public static void getRequest(HttpServletRequest requestx){
         request=requestx;
         
     }
     
     
}
