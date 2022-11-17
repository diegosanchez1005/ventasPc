//Copia de Practica y Logica
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Pc {
    private ArrayList<Componente> componentes= new ArrayList<>();
    private ArrayList<Cliente> clientes= new ArrayList<>();
    private String nombre;
    private int precio;
    private Vendedor vendedor;
    
    public Pc( String n, int p){
        this.precio= p;
        this.nombre= n;
    }

    public Pc(String nombre, int precio, Vendedor vendedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.vendedor = vendedor;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
    public void agregarComp(Componente c){
        componentes.add(c);
    }
    
    public void eliminarComp(Componente c){
        componentes.remove(c);
    }
    
    public String toString(){
        String cadena= this.vendedor.nombre;
        return cadena;
    }
    
    public double calcularTotalPc(){
        double total= this.precio;
        for(Componente c: componentes){
            total+= c.calcularPrecioComp();
            
        }
     
        return total+ this.precio;
    }
    
}
