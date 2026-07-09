package Conditionsloops;

import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2; // Starting from 2 because we already have two numbers in the series

        while(count <= n) {
            int temp = a + b;
            a = b;
            b = temp;
            count++; 

        }

        System.out.println(b);
        // Print the Fibonacci series up to n terms
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        // a = 0, b = 1
        // a = b; b = a + b;
        // count = count + 1;
    }

}
