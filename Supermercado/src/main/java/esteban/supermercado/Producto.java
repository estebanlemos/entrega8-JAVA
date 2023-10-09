package esteban.supermercado;
public abstract class Producto {
    private String nombre;
    private double precio;
    
    public Producto(){
    
   }
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public String toString() {
    String cadena = "\n------------------------------------------";
    cadena += "\nNombre de producto: " + this.nombre;
    cadena += "\nPrecio: $" + this.precio;
    
    return cadena;
    }
}
