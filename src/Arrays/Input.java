package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //array of primitives
//        int[] arr = new int[5];
//        //input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for (int j : arr) { // for every element in array, print the element
//            System.out.print(j + " "); // here j represents element of the array
//        }

        //System.out.println(arr[5]); //index out of bound error

        //array of objects
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        str[2] = "parsodkar";

        System.out.println(Arrays.toString(str));
    }
}
