import java.util.Scanner;

public class Exercise_7 {

    public static void exec_7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number k: ");
        int k = scanner.nextInt();

        for (int i = 50; i <= 100; i++) {
            if (i%k != 0){
                System.out.print("");
            }else {
                System.out.println(i);
            }
        }

        //Użytkownik wprowadza zakres:
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter a number k: ");
        int k2 = scanner.nextInt();
        System.out.println("Please enter min value: ");
        int minValue = scanner2.nextInt();
        System.out.println("Please enter max value: ");
        int maxValue = scanner2.nextInt();
        System.out.println("Min value is: " + minValue + " , max value is: " + maxValue + " , k is: " + k2);

        for (int i = minValue; i <= maxValue; i++) {
            if (i % k2 == 0) {
                System.out.println(i);
            } else {
                System.out.print("");
            }
        }
    }
}

