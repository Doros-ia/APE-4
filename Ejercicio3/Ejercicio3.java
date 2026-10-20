// Ejercicio 3 - Veterinaria
// Autor: Dorian Calderon

import java.util.Locale;

class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;
}

public class Ejercicio3 {
    public static void main(String[] args) {

        Mascota m1 = new Mascota();
        m1.nombre = "Max";
        m1.especie = "Perro";
        m1.edad = 5;
        m1.peso = 28.5;

        Mascota m2 = new Mascota();
        m2.nombre = "Michi";
        m2.especie = "Gato";
        m2.edad = 3;
        m2.peso = 4.2;

        Mascota m3 = new Mascota();
        m3.nombre = "Rocky";
        m3.especie = "Perro";
        m3.edad = 7;
        m3.peso = 18;

        Mascota[] pacientes = {m1, m2, m3};

        for (Mascota m : pacientes) {
            System.out.printf(Locale.US, "%s : %s : %.1f kg", m.nombre, m.especie, m.peso);
            if (m.peso > 20) {
                System.out.print("  Revisar peso");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Edad de m1 antes: " + m1.edad);

        Mascota m4 = m1;
        m4.edad = m4.edad + 1;

        System.out.println("Edad de m1 despues: " + m1.edad);

        // m1.edad cambio aunque solo se modifico m4. Esto pasa porque
        // "Mascota m4 = m1;" no crea una mascota nueva: m4 guarda la misma
        // referencia (direccion de memoria) que m1. Las dos variables apuntan
        // al mismo objeto, entonces al cambiar m4.edad se cambia el unico
        // objeto que existe y por eso m1.edad tambien muestra 6.
    }
}
