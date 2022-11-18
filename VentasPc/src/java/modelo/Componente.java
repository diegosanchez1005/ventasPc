//JOSEPH GUERRERO
package modelo;


public abstract class Componente {
    public String nombre;
    public String paisOrigen;
    public int precio;
    
//CONSTRUCTOR    
    public Componente(String n, String po, int p){
        this.nombre= n;
        this.paisOrigen= po;
        this.precio= p;
    }
    
//CALCULA EL PRECIO DE UN COMPONENTE DEPENDIENDO EL ORIGEN
//SI ES IMPORTADO LE SUMA UN 10% DE INTERES O IMPUESTO, SI ES DE ACA MANTIENE SU PRECIO
//METODO CORREGIDO POR DIEGO SANCHEZ
    public double calcularPrecioComp(){
        if(this.paisOrigen == "USA"){
            double pf= this.precio;
            pf += this.precio/100 * 10;
            return pf;
        }
        return this.precio;
    }

// GETTERS Y SETTERS    
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
    

    
}

