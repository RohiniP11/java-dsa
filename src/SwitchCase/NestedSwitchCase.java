package SwitchCase;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1:
            System.out.println("Rohini Parsodkar");
            break;
            case 2:
            System.out.println("Aditi Patil");
            break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    default:
                        System.out.println("Unknown Department");
                        break;
                }
            break;
            default:
            System.out.println("Employee not found");
            break;
        }
    }
}
