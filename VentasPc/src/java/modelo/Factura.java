/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import modelo.Cliente;

/**
 *
 * @author Diego
 */
public class Factura {
    
    private double precio;
    private boolean cyberM;
    private Cliente cliente;
    ArrayList<Pc> pcs= new ArrayList<>();
    Pc pc;
    ArrayList<Cliente> clientes= new ArrayList<>();
    
    public Factura(Cliente c){
        this.cliente= c;
    }
    
    
    
    public double calcularDescuente(){
        double total= pc.getPrecio();
        for(Cliente c: clientes){
            if(c.correo.contains(this.cliente.correo)){
                total -= 500;
                System.out.println("Descuento de 20%");
            }
        }
        return total;
    }

   
    public void addCliente(Cliente c){
           clientes.add(c);
        }
    
    public void addPc(Pc pc){
        pcs.add(pc);
    }
}


//ArrayList<Facturas> facturas = bdd.selectFacturas(); //el selectFacturas consulta a la base de datos las facturas y las va sumando a un

//for(Facturas a: facturas){
//    %>
//        <p>Cliente: <%=a.getCliente().getNombre()%></p>
//    <%

//}
