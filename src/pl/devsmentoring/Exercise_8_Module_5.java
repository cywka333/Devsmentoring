package pl.devsmentoring;

import java.sql.SQLOutput;

public class Exercise_8_Module_5 {
    public static void main(String[] args) {


        //Napisz program, który policzy, ile znajduje się liczb trzycyfrowych w każdej z nich.

        int[] numbers = {10, 20, 30, 100, 50, 2000};
        int[][] numbers2D = {{100, 20}, {500, 1000}, {300, 200}, {1000, 50000}};
        // 4 wiersze i 2 kolumny

        int threeNumbersInFirstArray = 0;
        int threeNumbersInSecondArray = 0;


        for (int firstCounting : numbers) {
            if (firstCounting >= 100) {
                threeNumbersInFirstArray++;
            }
        }
        System.out.println(threeNumbersInFirstArray);


        for (int[] arrayName : numbers2D) {
            for (int elem : arrayName) {
                if (elem > 100){
                    threeNumbersInSecondArray++;
                }
            }

        }


    }
}


