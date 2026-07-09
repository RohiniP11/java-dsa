package SwitchCase;

import java.util.Scanner; 

public class Switch2 {
    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);

        int day = yo.nextInt();
        
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");  
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;

        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("Invalid day number, please enter a number between 1 and 7.");
        // }   

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day number, please enter a number between 1 and 7.");
        }
    }
}