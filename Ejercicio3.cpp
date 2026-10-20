// Ejercicio 3 - Veterinaria
// Autor: Dorian Calderon

#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Mascota {
public:
    string nombre;
    string especie;
    int edad;
    double peso;
};

int main() {
    Mascota m1;
    m1.nombre = "Max";   m1.especie = "Perro"; m1.edad = 5; m1.peso = 28.5;

    Mascota m2;
    m2.nombre = "Michi"; m2.especie = "Gato";  m2.edad = 3; m2.peso = 4.2;

    Mascota m3;
    m3.nombre = "Rocky"; m3.especie = "Perro"; m3.edad = 7; m3.peso = 18;

    Mascota pacientes[3] = {m1, m2, m3};

    cout << fixed << setprecision(1);
    for (int i = 0; i < 3; i++) {
        cout << pacientes[i].nombre << " : " << pacientes[i].especie << " : "
             << pacientes[i].peso << " kg";
        if (pacientes[i].peso > 20) {
            cout << "  Revisar peso";
        }
        cout << endl;
    }

    cout << endl;
    cout << "Edad de m1 antes: " << m1.edad << endl;

    // En C++ un objeto se copia por valor, asi que para que se comporte
    // igual que "Mascota m4 = m1;" en Java se usa una referencia (&).
    Mascota& m4 = m1;
    m4.edad = m4.edad + 1;

    cout << "Edad de m1 despues: " << m1.edad << endl;

    // m1.edad cambio porque m4 no es una mascota nueva: es otro nombre
    // (referencia) para el mismo objeto m1. Al modificar m4.edad se modifica
    // el unico objeto que existe, por eso m1.edad ahora vale 6.
    // Si se escribiera "Mascota m4 = m1;" sin el &, C++ haria una copia y
    // m1.edad seguiria en 5.
    return 0;
}
