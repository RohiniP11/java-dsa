package SwitchCase;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        System.out.println("Enter the name of a fruit:");
        String fruit = yo.next();

        if (fruit.equals("mango")) {  //.equals() is used to compare strings in Java , it check the value of strings
            System.out.println("King of fruits");
        }
        else if (fruit.equals("apple")) {
            System.out.println("Apple a day keeps doctor away");
        }
        else if (fruit.equals("banana")) {
            System.out.println("Banana is a good source of potassium");             
        }
        else {
            System.out.println("I don't know about this fruit");
        }
        yo.close(); // Closing the scanner to prevent resource leak
        
        System.out.println("Thank you for using the fruit information system!");
    }

}
