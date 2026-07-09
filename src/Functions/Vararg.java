package Functions;

import java.util.Arrays;
public class Vararg {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 56, 87, 23, 45, 65);
        fun();

        multiple(2, 3, "Rohini", "Aditi", "Swara", "Tajshri");

        demo(1, 2, 3, 4);
        demo("Rohini", "Aditi", "Swara", "Tajshri");
        //demo(); //error 
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
        
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

}
