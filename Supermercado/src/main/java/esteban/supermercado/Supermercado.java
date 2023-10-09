package esteban.supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrito carrito = new Carrito();
        
        // Creo algunos productos de muestra
        ProductoDeAlmacen producto1 = new ProductoDeAlmacen("Vino Tinto",500.00,1);
        ProductoDeAlmacen producto2 = new ProductoDeAlmacen("Vino Blanco", 459.10, 2);
        ProductoDeAlmacen producto3 = new ProductoDeAlmacen("Pizza Muzza", 1740.20, 3);
        ProductoDeAlmacen producto4 = new ProductoDeAlmacen("Servilletas",500.00,4);
        ProductoDeAlmacen producto5 = new ProductoDeAlmacen("Pizza Vegana", 2459.10, 5);
        ProductoDeAlmacen producto6 = new ProductoDeAlmacen("Agua Mineral", 450.50, 6);
        
        // Agregar los productos a una lista de productos disponibles para mostrar a cliente
        ArrayList<ProductoDeAlmacen> productosDisponibles = new ArrayList<>();
        productosDisponibles.add(producto1);
        productosDisponibles.add(producto2);
        productosDisponibles.add(producto3);
        productosDisponibles.add(producto4);
        productosDisponibles.add(producto5);
        productosDisponibles.add(producto6);
        
        
        int opcion;

        do {
            // Mostrar menú
            System.out.println("Supermercado - Menú de Compra");
            System.out.println("1. Agregar producto al carrito");
            System.out.println("2. Ver cantidad de productos en el carrito");
            System.out.println("3. Ver importe total del carrito");
            System.out.println("4. Ver contenido del carrito");
            System.out.println("0. Salir");

            // Leer la elección del cliente
            System.out.print("Ingrese su elección: ");
            opcion = scanner.nextInt();

            // Procesar la elección del cliente
            switch (opcion) {
                case 1:
                    // Mostrar lista de productos disponibles y agregar producto al carrito
                    System.out.println("---------------------------");
                    System.out.println("Productos disponibles:");
                    int i = 1;
                    for (ProductoDeAlmacen producto : productosDisponibles) {
                        System.out.println(i + ". " + producto.getNombre() + " - Precio: $" + producto.getPrecio());
                        i++;
                    }
                    System.out.print("Seleccione un producto por número: ");
                    int seleccion = scanner.nextInt();

                    if (seleccion >= 1 && seleccion <= productosDisponibles.size()) {
                        ProductoDeAlmacen productoSeleccionado = productosDisponibles.get(seleccion - 1);
                        carrito.agregarProducto(productoSeleccionado);
                        System.out.println("---------------------------");
                        System.out.println("Producto agregado al carrito: " + productoSeleccionado.getNombre());
                        System.out.println("---------------------------");
                    } else {
                        System.out.println("---------------------------");
                        System.out.println("Selección no válida. Intente de nuevo.");
                        System.out.println("---------------------------");
                    }
                    break;
                    
                case 2:
                    
                    //Ver cantidad de productos en el carrito
                    System.out.println("---------------------------");
                    System.out.println("Tu carrito tiene esta cantidad de items: " + carrito.cantidadProductos());
                    System.out.println("---------------------------");
                    break;
                    
                case 3:
                    
                    //Mostrar el importe total del carrito 
                    System.out.println("---------------------------");
                    carrito.mostrarTotalCarrito();
                    System.out.println("---------------------------");
                    break;
                
                case 4:
                    
                    //Mostrar el contenido del carrito
                    System.out.println("---------------------------");
                    carrito.mostrarContenidoCarrito();
                    System.out.println("---------------------------");
                    break;    
                 
            }
        } while (opcion != 0);

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}

        
    

