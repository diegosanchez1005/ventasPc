/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego
 */
public abstract class Persona {
    public String nombre;
    protected String apellido;
    protected int dni;
    public int telefono;
    
    public Persona(String n, String a, int d, int t){
        this.nombre= n;
        this.apellido= a;
        this.dni= d;
        this.telefono= t;
    }

    public Persona(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    

    public Persona(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    

}