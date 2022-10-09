import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Zadanie 3
        System.out.println("Podaj swoje imię: ");
        Scanner scannerImie = new Scanner(System.in);
        String imie = scannerImie.nextLine();
        System.out.println("Podaj swoje nazwisko: ");
        Scanner scannerNazwisko = new Scanner(System.in);
        String nazwisko = scannerNazwisko.nextLine();
        System.out.println("Podaj ile masz lat (pełne lata): ");
        Scanner scannerWiek = new Scanner(System.in);
        byte wiek = scannerWiek.nextByte();
        System.out.println("Podaj swój wzrost: ");
        Scanner scannerWzrost = new Scanner(System.in);
        float wzrost = scannerWzrost.nextFloat();

        System.out.println("Hello " + imie + " " + nazwisko + "! Thank you for joining us. \n" +
                "You are " + wiek + " years old and your height is " + wzrost + "\n");




    }
}