
package esteban.supermercado;
public class ProductoDeAlmacen extends Producto implements IIVA {
    
    private int id;
    
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(int id){
        return this.id;
    }
    
    public ProductoDeAlmacen(String nombre, double precio, int id) {
        super(nombre, precio);
        this.id = id;
    }
    
    @Override
    public double calcularIva() {
        return getPrecio()*0.21;
    }
    
    @Override
    public String toString(){
     String cadena = super.toString();
     cadena += "\nID Producto: " + this.id;   
     
     return cadena;
    }
}



