// Ejercicio 2 - Inventario de una tienda
// Autor: Dorian Calderon

#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Producto {
public:
    string nombre;
    double precio;
    int stock;
};

int main() {
    Producto tienda[4];

    tienda[0].nombre = "Arroz";  tienda[0].precio = 1.25; tienda[0].stock = 20;
    tienda[1].nombre = "Aceite"; tienda[1].precio = 3.80; tienda[1].stock = 6;
    tienda[2].nombre = "Azucar"; tienda[2].precio = 1.10; tienda[2].stock = 15;
    tienda[3].nombre = "Leche";  tienda[3].precio = 0.95; tienda[3].stock = 7;

    cout << fixed << setprecision(2);

    cout << "--- Productos de la tienda ---" << endl;
    for (int i = 0; i < 4; i++) {
        cout << tienda[i].nombre << " : " << tienda[i].precio << endl;
    }

    // Simulacion de venta: 3 unidades de Aceite y 3 de Leche
    tienda[1].stock = tienda[1].stock - 3;
    tienda[3].stock = tienda[3].stock - 3;
    cout << endl;
    cout << "Se vendieron 3 unidades de " << tienda[1].nombre
         << " y 3 de " << tienda[3].nombre << endl;

    cout << endl;
    cout << "--- Inventario despues de la venta ---" << endl;
    double total = 0;
    for (int i = 0; i < 4; i++) {
        cout << tienda[i].nombre << " : " << tienda[i].precio << "  stock " << tienda[i].stock;
        if (tienda[i].stock < 5) {
            cout << "  Reponer";
        }
        cout << endl;
        total = total + tienda[i].precio * tienda[i].stock;
    }

    cout << "Valor total del inventario: " << total << endl;
    return 0;
}
