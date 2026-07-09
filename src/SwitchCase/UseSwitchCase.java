package SwitchCase;

import java.util.Scanner;

public class UseSwitchCase {
    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        int op;
        
        
        
        do {
            System.out.println("Enter the name of a fruit:");
            String fruit = yo.next();

            switch (fruit) {
            case "Mango":
            System.out.println("King of fruits");
            break;
            case "Apple":
            System.out.println("A sweet red fruit");
            break;
            case "Orange":
            System.out.println("Round fruit");
            break;
            case "Grapes":
            System.out.println("Small fruit");
            break;
            default:
            System.out.println("We don't know about this fruit");
            
        }
        System.out.println("Enter 1 or 0:");
        op = yo.nextInt();
        } while(op != 0);
    System.out.println("Thank you for using the fruit information system!");
}

}

/*
 * switch (fruit) {
 * case "Mango" -> System.out.println("King of fruits");
 * case "Apple" -> System.out.println("A sweet red fruit");
 * case "Orange" -> System.out.println("Round fruit");
 * case "Grapes" -> System.out.println("Small fruit");
 * default -> System.out.println("We don't know about this fruit");
 * }
 * yo.close(); // Closing the scanner to prevent resource leak
 */