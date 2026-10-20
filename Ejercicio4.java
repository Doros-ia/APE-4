// Ejercicio 4 - Cuenta de ahorro
// Autor: Dorian Calderon

import java.util.Locale;

class Cuenta {
    String titular;
    double saldo;
}

public class Ejercicio4 {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta();
        c1.titular = "Ana Paredes";
        c1.saldo = 200;

        Cuenta c2 = new Cuenta();
        c2.titular = "Luis Chicaiza";
        c2.saldo = 350;

        // Cuenta 1
        System.out.println("--- Cuenta de " + c1.titular + " ---");
        int meses1 = 0;
        while (c1.saldo < 500) {
            c1.saldo = c1.saldo + 50;
            meses1++;
            System.out.printf(Locale.US, "%s : %.2f%n", c1.titular, c1.saldo);
        }

        // Cuenta 2
        System.out.println();
        System.out.println("--- Cuenta de " + c2.titular + " ---");
        int meses2 = 0;
        while (c2.saldo < 500) {
            c2.saldo = c2.saldo + 50;
            meses2++;
            System.out.printf(Locale.US, "%s : %.2f%n", c2.titular, c2.saldo);
        }

        System.out.println();
        System.out.println(c1.titular + " necesito " + meses1 + " meses");
        System.out.println(c2.titular + " necesito " + meses2 + " meses");
    }
}
