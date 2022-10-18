package pl.devsmentoring;

//Sprawdzanie, czy liczba jest doskonała.
//Napisz program, który sprawdzi, czy podana przez usera liczba jest doskonała. Liczba doskonała,
// to taka liczba, która jest sumą wszystkich swoich dzielników właściwych (czyli mniejszych od niej samej).
//Przykłady liczb doskonałych: 6 (6 = 1 + 2 + 3), 28, 496, 8128.
//
//Podpowiedź:
//Wykorzystaj również instrukcje warunkowe i modulo (%)

import java.util.Scanner;

public class Exercise_15 {
    static int odczytajLiczbe() {
        Scanner odczyt = new Scanner(System.in);
        return odczyt.nextInt();
    }

    static boolean sprawdzLiczbeDoskonala(int liczba) {

        int suma = 0;

        for (int i = 1; i < liczba; i++) {
            if (liczba % i == 0)
                suma += i;
        }

        if (suma == liczba) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int liczba;

        System.out.println("Podaj dowolną liczbę.");

        liczba = odczytajLiczbe();

        if (sprawdzLiczbeDoskonala(liczba))
            System.out.println("Podana liczba jest doskonala");

        else
            System.out.println("Podana liczba nie jest doskonala");

    }

}