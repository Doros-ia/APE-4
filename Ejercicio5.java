// Ejercicio 5 - Biblioteca
// Autor: Dorian Calderon

class Libro {
    String titulo;
    String autor;
    boolean disponible;
}

class Socio {
    String nombre;
    int librosPrestados;
}

public class Ejercicio5 {
    public static void main(String[] args) {

        Libro l1 = new Libro();
        l1.titulo = "Don Quijote";
        l1.autor = "Miguel de Cervantes";
        l1.disponible = true;

        Libro l2 = new Libro();
        l2.titulo = "El Principito";
        l2.autor = "Antoine de Saint-Exupery";
        l2.disponible = true;

        Libro l3 = new Libro();
        l3.titulo = "Huasipungo";
        l3.autor = "Jorge Icaza";
        l3.disponible = true;

        Libro l4 = new Libro();
        l4.titulo = "La Odisea";
        l4.autor = "Homero";
        l4.disponible = true;

        Socio s1 = new Socio();
        s1.nombre = "Maria Jose Silva";
        s1.librosPrestados = 0;

        Socio s2 = new Socio();
        s2.nombre = "Pablo Andrade";
        s2.librosPrestados = 0;

        // El primer socio presta 2 libros
        l1.disponible = false;
        s1.librosPrestados++;
        l2.disponible = false;
        s1.librosPrestados++;

        // El segundo socio presta 1 libro
        l3.disponible = false;
        s2.librosPrestados++;

        Libro[] biblioteca = {l1, l2, l3, l4};
        int disponibles = 0;

        System.out.println("--- Libros ---");
        for (Libro l : biblioteca) {
            if (l.disponible) {
                System.out.println(l.titulo + " : Disponible");
                disponibles++;
            } else {
                System.out.println(l.titulo + " : Prestado");
            }
        }

        System.out.println();
        System.out.println("--- Socios ---");
        System.out.println(s1.nombre + " : " + s1.librosPrestados);
        System.out.println(s2.nombre + " : " + s2.librosPrestados);

        System.out.println();
        System.out.println("Libros disponibles: " + disponibles);
    }
}
