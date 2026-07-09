package Conditionsloops;


public class CountNums {
    public static void main(String[] args) {
        int n = 1333743239;

        int count = 0;
        

        while (n > 0) {
            int rem = n % 10; // Get the last digit
            if ( rem == 3){
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);
    }


}
