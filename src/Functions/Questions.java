package rohini;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c < n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        // if (c > n) {
        //     return true;
        // }
        // return false;

        return true;
    }

    /*
     if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
     */
}

