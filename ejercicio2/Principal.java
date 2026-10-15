import clientes.*;
import Productos.*;
import Productos.Computadoras.*;
import Productos.DispositivosMovil.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void creandoProductos(Cliente cliente) {
        ArrayList<Producto> productos = cliente.getProductos();
        
        productos.add(new Laptop((short) 8000, "Dell", (short)16, (short) 512, "Windows 10", (short) 2, (short) 10, true, true, true));
        productos.add(new Laptop((short) 12000, "HP", (short)8, (short) 256, "Windows 11", (short) 1, (short) 8, true, true, false));
        productos.add(new Laptop((short) 15000, "Apple", (short)16, (short) 1024, "macOS", (short) 1, (short) 12, true, false, false));
        
        productos.add(new Pc((short) 800, "Lenovo", (short)8, (short) 512, "Windows 10", true, true, true, true, true));
        productos.add(new Pc((short) 900, "Asus", (short)16, (short) 1024, "Windows 11", true, false, true, true, false));
        productos.add(new Pc((short) 1100, "Acer", (short)16, (short) 2048, "Windows 10", false, true, true, false, false));
        
        productos.add(new Tablet((short) 3000, "Samsung", "Galaxy Tab", (short) 128, true, true, true, (short) 10, true));
        productos.add(new Tablet((short) 4000, "Apple", "iPad", (short) 256, true, false, false, (short) 12, true));
        productos.add(new Tablet((short) 5000, "Huawei", "MatePad", (short) 512, true, false, false, (short) 13, false));

        productos.add(new Smartphone((short) 6000, "Samsung", "Galaxy S21", (short) 128, (short) 6, (short) 3, true, true, true));
        productos.add(new Smartphone((short) 7000, "Apple", "iPhone 13", (short) 256, (short) 6, (short) 3, true, false, false));
        productos.add(new Smartphone((short) 8000, "Google", "Pixel 6", (short) 512, (short) 6, (short) 3, true, false, false));

        productos.get(0).setDescuentoGeneral(200);
        productos.get(0).setDescuentoEstudiante(1000);

        productos.get(1).setDescuentoGeneral(300);
        productos.get(1).setDescuentoEstudiante(1500);

        productos.get(3).setDescuentoGeneral(50);
        productos.get(3).setDescuentoEstudiante(200);

        productos.get(6).setDescuentoGeneral(100);
        productos.get(6).setDescuentoEstudiante(500);
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de cliente (VIP, Estudiante, Regular): ");
        String tipoCliente = myScanner.nextLine();

        Cliente cliente;
        switch (tipoCliente.toLowerCase()) {
            case "vip":
                cliente = new ClienteVIP();
                ClienteVIP.saludo();
                break;
            case "estudiante":
                cliente = new ClienteEstudiante();
                break;
            case "regular":
                cliente = new ClienteRegular();
                break;
            default:
                System.out.println("Invalido, saliendo del programa.");
                myScanner.close();
                return;
        }

        creandoProductos(cliente);

        int opcion = -1;
        while(opcion != 6) {
            System.out.println("--------------------");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar productos disponibles");
            System.out.println("2. Mostrar información de un producto");
            System.out.println("3. Agregar producto al carrito");
            System.out.println("4. Mostrar carrito");
            System.out.println("5. Comprar");
            System.out.println("6. Salir");

            opcion = myScanner.nextInt();
            myScanner.nextLine();
            switch (opcion) {
                case 1:
                    cliente.imprimirProductos();
                    break;
                case 2:
                    System.out.println("Ingresa el índice del producto a mostrar información: ");
                    int id = myScanner.nextInt();
                    myScanner.nextLine();
                    cliente.imprimirProductoCompleto(id);
                    break;
                case 3:
                    System.out.println("Ingresa el índice del producto a agregar al carrito: ");
                    int idCarrito = myScanner.nextInt();
                    myScanner.nextLine();
                    cliente.ingresarEnCarrito(idCarrito);
                    break;
                case 4:
                    cliente.imprimirCarrito();
                    break;
                case 5:
                    cliente.comprar();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

        myScanner.close();
    }
}