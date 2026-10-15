package clientes;

import Productos.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Cliente {
    private ArrayList<Producto> productos = new ArrayList<>();
    private LinkedList<Producto> carrito = new LinkedList<>();


    public void imprimirProductos() {
        int i = 0;
        for (Producto producto : productos) {
            System.out.println("Articulo " + i++);
            producto.imprimirse();
        }
    }

    public int imprimirCarrito() {
        int i = 0;
        int total = 0;
        for (Producto producto : carrito) {
            System.out.println("Articulo " + i++);
            producto.imprimirse();
            total += producto.getPrecio();
        }
        System.out.println("El total en el carrito es: ");
        System.out.println("    $" + total);

        return total;
    }

    public void ingresarEnCarrito(int id) {
        if(id < 0 || id >= productos.size())
            System.out.println("Indice invalido");

        if((getClass() == ClienteEstudiante.class && productos.get(id).getPermisoEstudiante()) || (getClass() == ClienteRegular.class && productos.get(id).getPermisoRegular()) || (getClass() == ClienteVIP.class && productos.get(id).getPermisoVip())) {
            carrito.add(productos.remove(id));
            System.out.println("Producto agregado al carrito");
        }
        else
            System.out.println("No tienes permiso para comprar este producto");
    }

    public LinkedList<Producto> getCarrito() {
        return carrito;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void comprar() {
        int total = imprimirCarrito();
        System.out.println("El total a pagar es: ");
        System.out.println("    $" + total);
        System.out.println("Gracias por su compra.");
        carrito.clear();
    }

    public void imprimirProductoCompleto(int id) {
        if (id < 0 || id >= productos.size()) {
            System.out.println("Índice inválido");
            return;
        }
        
        productos.get(id).imprimirInformacion();
    }
}