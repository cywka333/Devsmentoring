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

        // Zadanie 4
        Scanner scannerLiczbaCalkowita = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int liczbaCalkowita = scannerLiczbaCalkowita.nextInt();
        System.out.println(liczbaCalkowita % 2 == 0 ? "Liczba jest parzysta!" : "Liczba jest nieparzysta!");


        // Zadanie 5
        Scanner liczbaCalkowitaFizzBuzz = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę całkowitą: ");
        int podanaLiczba = liczbaCalkowitaFizzBuzz.nextInt();

        if (podanaLiczba % 3 == 0 && podanaLiczba % 4 == 0) {
            System.out.println("FizzBuzz");
        } else if (podanaLiczba % 4 == 0) {
            System.out.println("Buzz");
        } else if (podanaLiczba % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("N/A");
        }

        // Zadanie 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Zodiac sign: Aquarius, Pisces, Aries, Taurus, " +
                "Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius, Capricorn: ");
        String s = scanner.next();

        switch (s) {
            case "Aquarius" -> System.out.println("You're born between " + "20 Jan and 18 Feb");
            case "Pisces" -> System.out.println("You're born between " + "19 Feb and 19 Mar");
            case "Aries" -> System.out.println("You're born between " + "21 Mar and 19 Apr");
            case "Taurus" -> System.out.println("You're born between " + "20 Apr and 22 May");
            case "Gemini" -> System.out.println("You're born between " + "23 May and 21 Jun");
            case "Cancer" -> System.out.println("You're born between " + "22 Jun and 22 Jul");
            case "Leo" -> System.out.println("You're born between " + "23 Jul and 22 Aug");
            case "Virgo" -> System.out.println("You're born between " + "24 Aug and 22 Sep");
            case "Libra" -> System.out.println("You're born between " + "23 Sep and 22 May");
            case "Scorpio" -> System.out.println("You're born between " + "23 Oct and 21 Nov");
            case "Sagittarius" -> System.out.println("You're born between " + "22 Nov and 21 Dec");
            case "Capricorn" -> System.out.println("You're born between " + "22 Dec and 19 Jan");
            default -> System.out.println("You entered wrong value!");
        }
    }
}