package FirstIdeaProgram.rohini;

import java.util.Scanner;
public class type_casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();

        //larger = greater
        // int num = input.nextInt();
        // System.out.println(num);

        //type casting
        // int num = (int)(67.56f); //converted float into int
        // System.out.println(num);

        //automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte)(a); // byte can hold values from -128 to 127, so this will overflow
        // System.out.println(b); // 257 % 256 = 1 Output will be 1 due to overflow {its reminder}

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a * b) / c;

        // System.out.println(d);

        // byte b = 50;
        // b = b * 2; //gives error

        //int number = 'A';

        //System.out.println(number); // ASCII value of 'A' is 65
        //System.out.println("नमस्ते"); 
        //System.out.println("你好");

        // System.out.println(3 * 5.6); // float to double conversion
        // System.out.println(3 * 5.6f); // float to float conversion
        //System.out.println(3 * 5.69876543f); //double to float conversion
        // System.out.println(3 * 5.69876543); //double to double conversion

 
        byte b = 42;
        char c= 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);

        System.out.println((f * b) + " " + (i/c) + " " + (d * s));
        //float + int - double = double
        //float + int = float
        //int / char = int
        //double * short = double
        
        System.out.println(result);
    }

}
