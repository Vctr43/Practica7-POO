package clientes;

import Productos.*;

public class ClienteEstudiante extends Cliente {
    @Override 
    public void imprimirProductos() {
        int i = 0;
        for (Producto producto : getProductos()) {
            System.out.println("Articulo " + i++ + (producto.getPermisoEstudiante() ? "" : " NO DISPONIBLE"));
            producto.imprimirse();

            if (producto.getDescuentoEstudiante() != 0)
                System.out.println("    Descuento: $" + producto.getDescuentoEstudiante());
        }
    }

    @Override 
    public int imprimirCarrito() {
        int i = 0;
        int total = 0;
        for (Producto producto : getCarrito()) {
            System.out.println("Articulo " + i++ + (producto.getPermisoEstudiante() ? "" : " NO DISPONIBLE"));
            producto.imprimirse();

            if (producto.getDescuentoEstudiante() != 0)
                System.out.println("    Descuento: $" + producto.getDescuentoEstudiante());
            
            total += producto.getPrecio() - producto.getDescuentoEstudiante();
        }
        System.out.println("El total en el carrito es: ");
        System.out.println("    $" + total);
        return total;
    }


}