package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum3(20, 30);
        System.out.println(ans);

        // int ans = sum2();
        // System.out.println(ans);
        //OR
        //System.out.println("The sum = " + sum2());

        //sum();
    }

    //pass the valye of numbers when you are calling the method in main
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;

    }

    //return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
        
    }


    
    //void - does not return any value
    //return_type - the type of value returned by the method
    //static - can be called without creating an object of the class
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
        in.close();
    }

}

/*
 * return_type name (arguments){
 * //body
 * return statement;
 * }
 */
