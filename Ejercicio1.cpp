// Ejercicio 1 - Notas del curso
// Autor: Dorian Calderon

#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Estudiante {
public:
    string nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;
};

int main() {
    Estudiante curso[5];

    curso[0].nombre = "Andrea Lopez";
    curso[0].nota1 = 8;   curso[0].nota2 = 9;   curso[0].nota3 = 7.5;

    curso[1].nombre = "Carlos Mena";
    curso[1].nota1 = 6;   curso[1].nota2 = 5.5; curso[1].nota3 = 7;

    curso[2].nombre = "Diana Ruiz";
    curso[2].nota1 = 4;   curso[2].nota2 = 3.5; curso[2].nota3 = 5;

    curso[3].nombre = "Esteban Vaca";
    curso[3].nota1 = 9;   curso[3].nota2 = 8;   curso[3].nota3 = 10;

    curso[4].nombre = "Fernanda Toapanta";
    curso[4].nota1 = 7;   curso[4].nota2 = 6.5; curso[4].nota3 = 7;

    int aprobados = 0;
    cout << fixed << setprecision(2);

    for (int i = 0; i < 5; i++) {
        curso[i].promedio = (curso[i].nota1 + curso[i].nota2 + curso[i].nota3) / 3;

        string estado;
        if (curso[i].promedio >= 7) {
            estado = "Aprobado";
            aprobados++;
        } else if (curso[i].promedio >= 5) {
            estado = "Supletorio";
        } else {
            estado = "Reprobado";
        }

        cout << curso[i].nombre << " : " << curso[i].promedio << " " << estado << endl;
    }

    cout << "Estudiantes aprobados: " << aprobados << endl;
    return 0;
}
