//Copia de Practica y Logica
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Pc {
    private ArrayList<Componente> componentes= new ArrayList<>();
    private String nombre;
    private int precio;
    
    public Pc( String n, int p){
        this.precio= p;
        this.nombre= n;
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
    
    public void agregarComp(Componente c){
        componentes.add(c);
    }
    
    public void eliminarComp(Componente c){
        componentes.remove(c);
    }
    
    public String toString(){
        String cadena= this.nombre+ " Componentes: ";
        
        for(Componente c: componentes){
            cadena+= "\n \t"+c.toString();
        }
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
