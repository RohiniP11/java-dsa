package rohini;

import java.util.Scanner;

public class Question2 {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int originalNum = num;
        int result = 0;

        while (num != 0) {
            int rem = num % 10;
            result = result + rem * rem * rem;
            num /= 10;
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
