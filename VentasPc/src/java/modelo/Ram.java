/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego
 */
public class Ram extends Componente{
    
    private int almacenamiento;
    
    public Ram(String n, String po, int p, int a){
        super(n, po, p);
        this.almacenamiento= a;
    }
    
    public String toString(){
        return "Ram "+ this.nombre+ " " + this.almacenamiento+ "gb";
    }
}
