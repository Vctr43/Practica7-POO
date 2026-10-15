package clientes;

import Productos.*;

public class ClienteRegular extends Cliente{

    @Override 
    public void imprimirProductos() {
        int i = 1;
        for (Producto producto : getCarrito()) {
            System.out.println("Articulo " + i++ + (producto.getPermisoRegular() ? "" : "NO DISPONIBLE"));
            producto.imprimirse();
            
            if (producto.getDescuentoGeneral() != 0)
                System.out.println("    Descuento: $" + producto.getDescuentoGeneral());
        }
    }

    @Override 
    public int imprimirCarrito() {
        int i = 1;
        int total = 0;
        for (Producto producto : getCarrito()) {
            System.out.println("Articulo " + i++ + (producto.getPermisoRegular() ? "" : "NO DISPONIBLE"));
            producto.imprimirse();
            
            if (producto.getDescuentoGeneral() != 0)
                System.out.println("    Descuento: $" + producto.getDescuentoGeneral());
            
            total += producto.getPrecio() - producto.getDescuentoGeneral();
        }
        System.out.println("El total en el carrito es: ");
        System.out.println("    $" + total);
        return total;
    }
}