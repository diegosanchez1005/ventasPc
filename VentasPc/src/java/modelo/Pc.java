//DIEGO SANCHEZ
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Pc {
    private int id;
    private ArrayList<Componente> componentes= new ArrayList<>();
    private ArrayList<Cliente> clientes= new ArrayList<>();
    private String nombre;
    private double precio;
    private Vendedor vendedor;

//CONSTRUCTORES    
    public Pc(int id, String n, double p){
        this.id= id;
        this.precio= p;
        this.nombre= n;
        
    }

    public Pc(String nombre, double precio, Vendedor vendedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.vendedor = vendedor;
    }

    public Pc() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
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
    
//AÑADE UN COMPONENTE A LA PC (IMPORTANTE PARA EL METODO calcularTotalPc)   
    public void agregarComp(Componente c){
        componentes.add(c);
    }
//ELIMINA UN COMPONENTE DE UNA PC    
    public void eliminarComp(Componente c){
        componentes.remove(c);
    }
    
    public String toString(){
        String cadena= this.vendedor.nombre;
        return cadena;
    }
 
//CALCULA EL TOTAL DE LA PC UNA VEZ QUE SE LE HAYAN AÑADIDO COMPONENTES
//CALCULA EL PRECIO EN BASE A LOS COMPONENTES QUE TENGA
    
    public double calcularTotalPc(){
        double total= this.precio;
        for(Componente c: componentes){
            total+= c.calcularPrecioComp();
            
        }
     
        return total+ this.precio;
    }
    
    
    
}
