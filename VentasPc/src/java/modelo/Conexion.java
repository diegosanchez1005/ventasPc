//DIEGO SANCHEZ
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Diego
 */

//CONSTRUCTOR DE CONEXION
public class Conexion {
    private Connection miConexion;
    public Conexion(){
             try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost/ventasPc","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

//FUNCION PARA AGREGAR CLIENTE A LA BD
     public boolean agregarCliente(Cliente cliente){       
        String consulta = "insert into cliente(nombre, apellido, direccion, telefono, correo) values(?,?,?,?,?)";
        try {
            PreparedStatement comando=miConexion.prepareStatement(consulta);
            comando.setString(1, cliente.getNombre());
            comando.setString(2, cliente.getApellido());
            comando.setString(3, cliente.getDirec());
            comando.setInt(4, cliente.getTelefono());
            comando.setString(5, cliente.getCorreo());
            System.out.println(comando.toString());
            comando.executeUpdate();    
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

//FUNCION PARA LOGUEARSE EN CASO DE TENER CUENTA    
        public boolean login(String correo){
         String consulta= "select * from cliente where correo = ?";
         try{
             PreparedStatement comando= miConexion.prepareStatement(consulta);
             comando.setString(1, correo);
             ResultSet rs= comando.executeQuery();
             while(rs.next()){
                return true;
             }
         }catch(SQLException ex){
             System.err.println(ex);
         }
         return false;
     }
        
        
//FUNCION PARA OBTENER UN CLIENTE INGRESANDO EL ID        
           public Cliente getClienteById(int id){
         
         String consulta= "select * from cliente where idCliente = ?";
         try{
             PreparedStatement comando= miConexion.prepareStatement(consulta);
             comando.setInt(1, id);
             ResultSet rs= comando.executeQuery();
             while(rs.next()){
                String n= rs.getString("nombre");
                String a= rs.getString("apellido");
                String d= rs.getString("direccion");
                int t= rs.getInt("telefono");
                String c= rs.getString("correo");
                
                Cliente c1= new Cliente(id,n,a,d,t,c);
                return c1;
                
             }
         }catch(SQLException ex){
             System.err.println(ex);
         }
         return null;
     }
           
//FUNCION PARA OBTENER UN VENDEDOR INGRESANDO EL ID               
              public Vendedor getVendedorById(int id){
         String consulta= "select * from vendedor where idVendedor = ?";
         try{
             PreparedStatement comando= miConexion.prepareStatement(consulta);
             comando.setInt(1, id);
             ResultSet rs= comando.executeQuery();
             while(rs.next()){
                String n= rs.getString("nombre");
                String a= rs.getString("apellido");
                Vendedor v1= new Vendedor(id, n ,a);
                return v1;
             }
         }catch(SQLException ex){
             System.err.println(ex);
         }
         return null;
     }
              
              
//FUNCION PARA OBTENER UNa PC INGRESANDO EL ID                   
         public Pc getPcById(int id){
         
         String consulta= "select * from computadora where idComp = ?";
         try{
             PreparedStatement comando= miConexion.prepareStatement(consulta);
             comando.setInt(1, id);
             ResultSet rs= comando.executeQuery();
             while(rs.next()){
                String n= rs.getString("nombre");
                double p= rs.getDouble("precio");
                Pc pc1= new Pc(id, n, p);
                return pc1;
                    }
                }catch(SQLException ex){
                System.err.println(ex);
                    }
          return null;
     }

//AGREGA UNA FACTURA A LA TABLA factura DE LA BD
        public boolean addFactura(Factura fact){       
        String consulta = "insert into factura(fecha, cyberMonday, idVendedor, idCliente, idComp) values(CURRENT_TIMESTAMP(),0,?,?,?)";
        try {
            PreparedStatement comando=miConexion.prepareStatement(consulta);
            comando.setInt(3, fact.getVendedor().getId());
            comando.setInt(4, fact.getCliente().getId());
            comando.setInt(5, fact.getPc().getId());
            comando.executeUpdate();    
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
   
         public ArrayList<Factura> devolverFacturas(){
         ArrayList<Factura> facturas = new ArrayList<>();
         String consulta= "Select * from factura";
         try{
             PreparedStatement comando= miConexion.prepareStatement(consulta);
             ResultSet rs= comando.executeQuery();
             while(rs.next()){
              Cliente c1= getClienteById(rs.getInt("idCliente"));
              Pc pc1= getPcById(rs.getInt("idPc"));
              Vendedor v1= getVendedorById(rs.getInt("idVendedor"));

              Factura fac= new Factura(c1, pc1, v1 );    
              facturas.add(fac);
             }
         }catch(SQLException ex){
             System.err.println(ex);
         }
         return facturas;
     }

//DEVUELVE LO FACTURADO EN UN CYBERMONDAY
        public double cyber(){
            double total = 0;
            String consulta= "Select SUM(precio) from factura where cYberMonday = 1";
         try{
             PreparedStatement comando= miConexion.prepareStatement(consulta);
             ResultSet rs= comando.executeQuery();
             rs.next();
             total+= rs.getDouble("precio");
             return total;
         }catch(SQLException ex){
             System.err.println(ex);
         }
         return total;
        }
    
}