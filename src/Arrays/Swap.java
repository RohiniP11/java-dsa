package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(arr));

        swap(arr, 1, 0);

        System.out.print("Swaped array is: ");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
