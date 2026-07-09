package Maths.math;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;   // number of decimal places

        System.out.printf("%.3f", sqrt(n, p));
    }

    //time = O(log(n))
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        // 1. Binary Search for integer part
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        // store integer part of sqrt
        root = e;

        // 2. Add decimal precision
        double incr = 0.1;

        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root = root + incr;
            }

            root = root - incr;
            incr = incr / 10;
        }

        return root;
    }
}
