package Recusrion_Problems.Easy;

public class easy {
    public static void main(String[] args) {
     //fun(5);
        reverse(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);

        fun(n-1);
    }

    static void reverse(int n) {
        if (n == 0) {
            return; //starts returning back
        }

        reverse(n-1);
        System.out.println(n);

    }

    static void Both(int n) {
        if (n == 0) {
            return; //starts returning back
        }

        System.out.println(n);
        Both(n-1);
        System.out.println(n);

    }

 //time complexity = O(n)

}