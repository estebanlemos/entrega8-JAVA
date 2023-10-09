package esteban.supermercado;
import java.util.ArrayList;


public class Carrito {
    private ArrayList<ProductoDeAlmacen> listaCarrito; 
    
    public Carrito(){
     listaCarrito = new ArrayList<ProductoDeAlmacen>();
    }
    
    public void agregarProducto(ProductoDeAlmacen producto){
        listaCarrito.add(producto);
    }
    
    public int cantidadProductos() {
        return listaCarrito.size();
    }
    
    public double importeTotal() {
        double importeTotal = 0.0;
        for (ProductoDeAlmacen producto : listaCarrito) {
            importeTotal += producto.getPrecio();
        }
        return importeTotal;
    }
    
     public double ivaTotal() {
        double ivaTotal = 0.0;
        for (ProductoDeAlmacen producto : listaCarrito) {
            ivaTotal += producto.calcularIva();
        }
        return ivaTotal;
    }
    
    public void mostrarContenidoCarrito() {
        System.out.println("El carrito tiene: ");
        for (ProductoDeAlmacen producto : listaCarrito) {
            System.out.println(producto);
        }
    }
    
    public void mostrarTotalCarrito() {
         double importeTotal = 0.0;
         double ivaTotal = 0.0;
        for (ProductoDeAlmacen producto : listaCarrito) {
           importeTotal += producto.getPrecio();
           ivaTotal += producto.calcularIva();
        }
        System.out.println("El total es: " + importeTotal);
        System.out.println("Mas impuestos de: " + ivaTotal);
    }
}
