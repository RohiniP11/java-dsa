package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        int[][] arr = new int[3][];

        int[][] arr1 = {
                {1, 2, 3}, //0th index
                {4, 5}, //1st
                {7, 8, 9, 7} // 2nd
        };

        System.out.println(Arrays.toString(arr1[1]));


        int[][] arr2 = new int[3][3];
        //System.out.println(arr.length); //no of rows
        Scanner in = new Scanner(System.in);

        //input
        for (int row = 0; row < arr2.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = in.nextInt();
            }
        }

//        //output
//        for (int row = 0; row < arr2.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr2[row].length; col++) {
//                System.out.print(arr2[row][col] + " ");
//            }
//            System.out.println();
//        }

        //OR

        //output
        for (int row = 0; row < arr2.length; row++) {
            System.out.println(Arrays.toString(arr2[row]));
        }

    }
}
