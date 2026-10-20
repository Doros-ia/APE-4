// Ejercicio 5 - Biblioteca
// Autor: Dorian Calderon

#include <iostream>
#include <string>
using namespace std;

class Libro {
public:
    string titulo;
    string autor;
    bool disponible;
};

class Socio {
public:
    string nombre;
    int librosPrestados;
};

int main() {
    Libro biblioteca[4];
    biblioteca[0].titulo = "Don Quijote";   biblioteca[0].autor = "Miguel de Cervantes";      biblioteca[0].disponible = true;
    biblioteca[1].titulo = "El Principito"; biblioteca[1].autor = "Antoine de Saint-Exupery"; biblioteca[1].disponible = true;
    biblioteca[2].titulo = "Huasipungo";    biblioteca[2].autor = "Jorge Icaza";              biblioteca[2].disponible = true;
    biblioteca[3].titulo = "La Odisea";     biblioteca[3].autor = "Homero";                   biblioteca[3].disponible = true;

    Socio s1;
    s1.nombre = "Maria Jose Silva";
    s1.librosPrestados = 0;

    Socio s2;
    s2.nombre = "Pablo Andrade";
    s2.librosPrestados = 0;

    // El primer socio presta 2 libros
    biblioteca[0].disponible = false;
    s1.librosPrestados++;
    biblioteca[1].disponible = false;
    s1.librosPrestados++;

    // El segundo socio presta 1 libro
    biblioteca[2].disponible = false;
    s2.librosPrestados++;

    int disponibles = 0;

    cout << "--- Libros ---" << endl;
    for (int i = 0; i < 4; i++) {
        if (biblioteca[i].disponible) {
            cout << biblioteca[i].titulo << " : Disponible" << endl;
            disponibles++;
        } else {
            cout << biblioteca[i].titulo << " : Prestado" << endl;
        }
    }

    cout << endl;
    cout << "--- Socios ---" << endl;
    cout << s1.nombre << " : " << s1.librosPrestados << endl;
    cout << s2.nombre << " : " << s2.librosPrestados << endl;

    cout << endl;
    cout << "Libros disponibles: " << disponibles << endl;
    return 0;
}
