package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(arr));

        reverse(arr);

        System.out.print("Reversed array is: ");
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }


}
