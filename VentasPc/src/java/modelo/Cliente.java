/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Diego
 */
public class Cliente extends Persona{
    public String correo;
    private String cuenta;
    private String pass;
    public String direc;

    public Cliente(String correo, String cuenta, String pass, String n, String a, int d, int t, String direc) {
        super(n, a, d, t);
        this.correo = correo;
        this.cuenta = cuenta;
        this.pass = pass;
        this.direc= direc;
    }

    public Cliente(String correo, String n, String a, int t) {
        super(n, a, t);
        this.correo = correo;
    }

    public Cliente(String nombre, String apellido, String direccion, int telefono, String correo) {
        super(nombre, apellido, telefono);
        this.correo = correo;
        this.direc = direccion;
    }

    public Cliente(String correo, String cuenta, String pass, String direc, String n, String a, int d, int t) {
        super(n, a, d, t);
        this.correo = correo;
        this.cuenta = cuenta;
        this.pass = pass;
        this.direc = direc;
    }

    public Cliente(String correo, String cuenta, String pass, String direc, String nombre, String apellido, int telefono) {
        super(nombre, apellido, telefono);
        this.correo = correo;
        this.cuenta = cuenta;
        this.pass = pass;
        this.direc = direc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}