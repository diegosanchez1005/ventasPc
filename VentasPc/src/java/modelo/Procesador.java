/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego
 */
public class Procesador extends Componente{
    
    private int velocidad;
    
    public Procesador(String n, String po, int p, int v){
        super(n, po, p);
        this.velocidad= v;
    }
    
    public String toString(){
        return "Procesador "+ this.nombre+ " " + this.velocidad;
    }
}
