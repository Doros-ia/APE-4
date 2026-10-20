// Ejercicio 1 - Notas del curso
// Autor: Dorian Calderon

import java.util.Locale;

class Estudiante {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;
}

public class Ejercicio1 {
    public static void main(String[] args) {

        // Creacion de las 5 instancias
        Estudiante e1 = new Estudiante();
        e1.nombre = "Andrea Lopez";
        e1.nota1 = 8;
        e1.nota2 = 9;
        e1.nota3 = 7.5;

        Estudiante e2 = new Estudiante();
        e2.nombre = "Carlos Mena";
        e2.nota1 = 6;
        e2.nota2 = 5.5;
        e2.nota3 = 7;

        Estudiante e3 = new Estudiante();
        e3.nombre = "Diana Ruiz";
        e3.nota1 = 4;
        e3.nota2 = 3.5;
        e3.nota3 = 5;

        Estudiante e4 = new Estudiante();
        e4.nombre = "Esteban Vaca";
        e4.nota1 = 9;
        e4.nota2 = 8;
        e4.nota3 = 10;

        Estudiante e5 = new Estudiante();
        e5.nombre = "Fernanda Toapanta";
        e5.nota1 = 7;
        e5.nota2 = 6.5;
        e5.nota3 = 7;

        // Se guardan en un arreglo para recorrerlos con un for
        Estudiante[] curso = {e1, e2, e3, e4, e5};
        int aprobados = 0;

        for (Estudiante e : curso) {
            e.promedio = (e.nota1 + e.nota2 + e.nota3) / 3;

            String estado;
            if (e.promedio >= 7) {
                estado = "Aprobado";
                aprobados++;
            } else if (e.promedio >= 5) {
                estado = "Supletorio";
            } else {
                estado = "Reprobado";
            }

            System.out.printf(Locale.US, "%s : %.2f %s%n", e.nombre, e.promedio, estado);
        }

        System.out.println("Estudiantes aprobados: " + aprobados);
    }
}
