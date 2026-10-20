// Ejercicio 2 - Inventario de una tienda
// Autor: Dorian Calderon

import java.util.Locale;

class Producto {
    String nombre;
    double precio;
    int stock;
}

public class Ejercicio2 {
    public static void main(String[] args) {

        Producto p1 = new Producto();
        p1.nombre = "Arroz";
        p1.precio = 1.25;
        p1.stock = 20;

        Producto p2 = new Producto();
        p2.nombre = "Aceite";
        p2.precio = 3.80;
        p2.stock = 6;

        Producto p3 = new Producto();
        p3.nombre = "Azucar";
        p3.precio = 1.10;
        p3.stock = 15;

        Producto p4 = new Producto();
        p4.nombre = "Leche";
        p4.precio = 0.95;
        p4.stock = 7;

        Producto[] tienda = {p1, p2, p3, p4};

        System.out.println("--- Productos de la tienda ---");
        for (Producto p : tienda) {
            System.out.printf(Locale.US, "%s : %.2f%n", p.nombre, p.precio);
        }

        // Simulacion de venta: 3 unidades de Aceite y 3 de Leche
        p2.stock = p2.stock - 3;
        p4.stock = p4.stock - 3;
        System.out.println();
        System.out.println("Se vendieron 3 unidades de " + p2.nombre + " y 3 de " + p4.nombre);

        System.out.println();
        System.out.println("--- Inventario despues de la venta ---");
        double total = 0;
        for (Producto p : tienda) {
            System.out.printf(Locale.US, "%s : %.2f  stock %d", p.nombre, p.precio, p.stock);
            if (p.stock < 5) {
                System.out.print("  Reponer");
            }
            System.out.println();
            total = total + p.precio * p.stock;
        }

        System.out.printf(Locale.US, "Valor total del inventario: %.2f%n", total);
    }
}
