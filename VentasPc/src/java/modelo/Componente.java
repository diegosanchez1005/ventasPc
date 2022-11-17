//Copia de Practica y Logica
package modelo;


public abstract class Componente {
    public String nombre;
    public String paisOrigen;
    public int precio;
    
    public Componente(String n, String po, int p){
        this.nombre= n;
        this.paisOrigen= po;
        this.precio= p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    public double calcularPrecioComp(){
        if(this.paisOrigen == "USA"){
            double pf= this.precio;
            pf += this.precio/100 * 10;
            return pf;
        }
        return this.precio;
    }
    
    //public String toString(){ 
   // return  this.nombre+ " ("+calcularPrecio() + "$)"  ;
    //}
}

