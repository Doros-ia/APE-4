// Ejercicio 4 - Cuenta de ahorro
// Autor: Dorian Calderon

#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Cuenta {
public:
    string titular;
    double saldo;
};

int main() {
    Cuenta c1;
    c1.titular = "Ana Paredes";
    c1.saldo = 200;

    Cuenta c2;
    c2.titular = "Luis Chicaiza";
    c2.saldo = 350;

    cout << fixed << setprecision(2);

    // Cuenta 1
    cout << "--- Cuenta de " << c1.titular << " ---" << endl;
    int meses1 = 0;
    while (c1.saldo < 500) {
        c1.saldo = c1.saldo + 50;
        meses1++;
        cout << c1.titular << " : " << c1.saldo << endl;
    }

    // Cuenta 2
    cout << endl;
    cout << "--- Cuenta de " << c2.titular << " ---" << endl;
    int meses2 = 0;
    while (c2.saldo < 500) {
        c2.saldo = c2.saldo + 50;
        meses2++;
        cout << c2.titular << " : " << c2.saldo << endl;
    }

    cout << endl;
    cout << c1.titular << " necesito " << meses1 << " meses" << endl;
    cout << c2.titular << " necesito " << meses2 << " meses" << endl;
    return 0;
}
