package Maths.Bitwise;

public class No0fDigits {
    public static void main(String[] args) {
        int n = 24567;
        int b = 10; //10 in decimal, 2 in binary

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);
    }
}
