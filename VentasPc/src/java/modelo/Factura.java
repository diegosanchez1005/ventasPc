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
    
    private Vendedor vendedor;
    private double precio;
    private boolean cyberM;
    private Cliente cliente;
    ArrayList<Pc> pcs= new ArrayList<>();
    ArrayList<Factura> facturas= new ArrayList<>();
    Pc pc;
    ArrayList<Cliente> clientes= new ArrayList<>();
    
    public Factura(Cliente c, Pc pc, Vendedor v){
        this.cliente= c;
        this.pc= pc;
        this.vendedor= v;
    }

    public Factura() {
    }
    
    
    
    public double calcularDescuento(){
                
        double total= pc.calcularTotalPc();
        total -= (total/100) * 5;
        return total;
    }
    
    public boolean validarDescuento(){
         for(Factura f: facturas){
            if(f.cliente.correo.contains(this.cliente.correo)){
                return true;
            }
        }
        return false;
    }
    
    public void addCliente(Cliente c){
           clientes.add(c);
        }
    
    public void addPc(Pc pc){
        pcs.add(pc);
    }
    
    public void addfactura(Factura f){
        facturas.add(f);
    }
    
    public double facturacionVendedor(Vendedor v){
        double fact= pc.calcularTotalPc();
        fact -= (pc.calcularTotalPc() / 100) * 80;
        return fact;
    }

    public String toString(){
        String cadena= "Cliente: "+ this.cliente.correo;
        cadena += "\n Pc: "+ this.pc.getNombre();
        cadena += "\n Vendido por: "+ this.vendedor.nombre;
        if(validarDescuento()){
            double descuento= pc.calcularTotalPc() - calcularDescuento();
            cadena += "\n Descuento de 5%: ";
            double total=pc.calcularTotalPc()- descuento;
            cadena += "Total: " +total;
        }else{
            cadena += "Total: "+ pc.calcularTotalPc();
        }
        
        return cadena;
    }
}


//ArrayList<Facturas> facturas = bdd.selectFacturas(); //el selectFacturas consulta a la base de datos las facturas y las va sumando a un

//for(Facturas a: facturas){
//    %>
//        <p>Cliente: <%=a.getCliente().getNombre()%></p>
//    <%

//}
