package pl.devsmentoring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Testing_Module_5 {

    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        List<String> students = new ArrayList<>(Arrays.asList("Kacper", "Anna", "Grzegorz"));

        String[] names = {"Joanna", "Anna", "Kacper", "Jerzy", "Kinga", "Patrycja", "Patryk", "Kamil", "Joanna", "Mikołaj"};

        System.out.println("List of my best friends: ");  /// to samo co: for(int i = 0; i < names.length; i++){
        //        System.out.println(names[i]);
        //    }

        for (String name : names) {
            System.out.println(name);
        }


//        System.out.println("Char");
//        char[] tabChar = new char[10];
//        System.out.println(tabChar[1]);
//        System.out.println(tabChar[2]);
//        System.out.println(tabChar[3]);
//
//        System.out.println(" ");
//        //bool i string
//        System.out.println("Boolean");
//        boolean[] tabBool = new boolean[5];
//        System.out.println(tabBool[0]);
//        System.out.println(tabBool[2]);
//        System.out.println(tabBool[3]);
//
//        System.out.println(" ");
//        System.out.println("String");
//        String[] tabString = new String[20];
//        System.out.println(tabString[2]);
//        System.out.println(tabString[3]);
//        System.out.println(tabString[4]);
//
//        System.out.println(" ");
//        System.out.println("int");
//        int[] tabInt = new int[3];
//        System.out.println(tabInt[0]);
//        System.out.println(tabInt[1]);
//
//        System.out.println(" ");
//        System.out.println("Byte");
//        byte[] tabByte = new byte[3];
//        System.out.println(tabByte[1]);
//        System.out.println(tabByte[2]);
//
//        System.out.println(" ");
//        System.out.println("Short");
//        short[] tabShort = new short[5];
//        System.out.println(tabShort[0]);
//        System.out.println(tabShort[1]);
//        System.out.println(tabShort[2]);
//
//        System.out.println(" ");
//        System.out.println("Long");
//        long[] tabLong = new long[5];
//        System.out.println(tabLong[2]);
//        System.out.println(tabLong[4]);
//
//        System.out.println(" ");
//        System.out.println("Float");
//        float[] tabFloat = new float[4];
//        System.out.println(tabFloat[1]);
//        System.out.println(tabFloat[2]);
//        System.out.println(tabFloat[3]);


//        int[][] arr = new int[4][5];
//        int value = 1;
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                arr[i][j] = value;
//                value++;
//            }
//        }
//
//        for(int[] subarr : arr){
//            for(int elem : subarr){
//                System.out.print(elem + " ");
//            }
//            System.out.println();
//        }

    }
}
