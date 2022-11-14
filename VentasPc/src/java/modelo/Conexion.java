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
     
        public boolean login(String correo){
         String consulta= "select * from cliente where correo = ?";
         try{
             PreparedStatement comando= miConexion.prepareStatement(consulta);
             comando.setString(1, correo);
             ResultSet rs= comando.executeQuery();
             if(rs.absolute(1)){
                return true;
             }
         }catch(SQLException ex){
             System.err.println(ex);
         }
         return false;
     }

    
}