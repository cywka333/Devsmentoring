public class Exercise_9 {

    public static void exec_9(){
        // N={1,2,3,4,5,6,...}
        int naturalNumber = 0;
        int counter = 0;

        while (naturalNumber <=10){
            for (int i=1;i<=10;i++){
                naturalNumber += i;
                counter++;
            }
        }
        System.out.println("The sum of first 10 natural numbers is: " + naturalNumber);
        System.out.println("The arythmetic avarage of fist 10 natural number is: " + naturalNumber/counter);
    }
}


