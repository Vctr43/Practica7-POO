package clientes;

import Productos.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Cliente {
    private ArrayList<Producto> productos = new ArrayList<>();
    private LinkedList<Producto> carrito = new LinkedList<>();

    public void imprimirCarrito() {
        int i = 1;
        int total = 0;
        for (Producto producto : carrito) {
            System.out.println("Articulo " + i++);
            producto.imprimirse();
            total += producto.getPrecio();
        }
        System.out.println("El total en el carrito es: ");
        System.out.println("    $" + total);
    }

    public void ingresarEnCarrito(int seccion, int id) {
        Producto producto = productos.get(id);
        carrito.add(producto);
    }
}