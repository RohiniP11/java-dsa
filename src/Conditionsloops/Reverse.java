package rohini;


public class Reverse {
    public static void main(String[] args) {
        int n = 1234;
        int ans = 0;
        

        // while (n > 0) {
        //     int rem = n % 10; // Get the last digit
        //     System.out.print(rem);
        //     n = n / 10;
        // }

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;

            ans = ans * 10 + rem;
        }

        
    }


}

