import java.util.Scanner;

public class Exercise_10 {
    public static void exec_10(){

        // Między 5000, a 30 000 litrów
        int astronauts; // max 7
        int startFuelLevel;

        System.out.println("Please enter a level of fuel. Enter value between 5000 and 30000.");
        Scanner scannerFuelLevelFromKeyboard = new Scanner(System.in);

        do {
            startFuelLevel = scannerFuelLevelFromKeyboard.nextInt();
            if (5000 <= startFuelLevel && startFuelLevel <= 30000) {
                break;}
            System.out.println("One more time. Give me value between 5000 and 30 0000");
            startFuelLevel++;

        }while (30000 < startFuelLevel || startFuelLevel < 5000);
        System.out.println("Your fuel level is: " + startFuelLevel + ". Prepare to start!");

        // 2 part
        System.out.println("Next step. Please give me the number of astronauts you wold like to have on board. " +
                "You can choose min. 1 and max. 7 astronauts.");
        Scanner scannerAstronautsOnBoard = new Scanner(System.in);
        do {
            astronauts = scannerAstronautsOnBoard.nextInt();
            if (1 <= astronauts && astronauts <= 7){
                break;}
            System.out.println("You entered too less or too much astronauts. Please choose 1-7 astronauts!");
            astronauts++;

        }while(7 <= astronauts || astronauts < 0);
        System.out.println("You choose: " + astronauts + ". Hope you like them.");
        System.out.println("\n We are preparing to start. You have your crew and fuel ready.\n");

        int fuelConsumption = 300 + (100*astronauts);
        int fuelTrip;

        // 3 part - need changes!!!!!! Fuel level is not updating

        for (int i = 0; i <= 2000; i+=100){
            if (i >= 2000){
                System.out.println("The spaceship reached the orbit");
            }else {
                System.out.println("The ship has traveled a distance of " + i);
                fuelTrip = startFuelLevel - fuelConsumption;
                do{
                    System.out.println("Fuel level: " + fuelTrip);
                    fuelTrip=-fuelTrip;
                }while(fuelTrip > 0);
            }
        }
    }
}
