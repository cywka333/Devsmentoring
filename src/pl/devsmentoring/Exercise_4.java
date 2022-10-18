package pl.devsmentoring;

public class Exercise_4 {

    public static void exec_4(){
        // Pętla for
        int y = 50;
        for(int i = 100; i >= y; i--){
            System.out.println(i);
        }
        System.out.println("\nPętla while\n");
        // WHILE
        int i = 100;
        while (i>=y){
            System.out.println(i);
            i--;
        }
    }
}
