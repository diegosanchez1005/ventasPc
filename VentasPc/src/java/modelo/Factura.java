//DIEGO SANCHEZ
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
    Pc pc;
    ArrayList<Cliente> clientes= new ArrayList<>();
 
//CONSTRUCTOR    
    public Factura(Cliente c, Pc pc, Vendedor v){
        this.cliente= c;
        this.pc= pc;
        this.vendedor= v;
    }
      

//METODO PARA DEVLVER LO QUE FACTURA UN DETERMINADO EMPLEADO DESPUES DE UNA VENTA
    public double facturacionVendedor(Vendedor v){
        double fact= pc.calcularTotalPc();
        fact -= (pc.calcularTotalPc() / 100) * 80;
        return fact;
    }

    public String toString(){
        String cadena= "Cliente: "+ this.cliente.correo;
        cadena += "\n Pc: "+ this.pc.getNombre();
        cadena += "\n Vendido por: "+ this.vendedor.nombre;
      cadena += "Total: "+ pc.calcularTotalPc();
        
        return cadena;
    }

//GETTERS Y SETTERS    
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isCyberM() {
        return cyberM;
    }

    public void setCyberM(boolean cyberM) {
        this.cyberM = cyberM;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Pc> getPcs() {
        return pcs;
    }

    public void setPcs(ArrayList<Pc> pcs) {
        this.pcs = pcs;
    }

    public Pc getPc() {
        return pc;
    }

    public void setPc(Pc pc) {
        this.pc = pc;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}



