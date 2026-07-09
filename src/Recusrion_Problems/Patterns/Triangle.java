package Recusrion_Problems.Patterns;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        //triangle2(4, 0);
        int[] arr = {8, 2, 7, 1};
        selection2(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c+1);
            System.out.print("* ");
        } else {
            triangle2(r - 1, 0);
            System.out.println();
        }
    }


    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            triangle(r, c+1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c+1]) {
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, r, c+1);
        } else {
            System.out.println();
            bubble(arr,r - 1, 0);
        }
    }

    static void selection(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c+1]) {
                int minInd = c;
                int i = c+1;
                while(i <= r){
                    if (arr[minInd] > arr[i]){
                        minInd = i;
                        i++;
                    } else{
                        i++;
                    }
                }
                int temp = arr[c];
                arr[c] = arr[minInd];
                arr[minInd] = temp;
            }
            selection(arr, r, c+1);
        } else {
            return;
        }
    }

    static void selection2(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection2(arr, r, c+1, c);
            } else{
                selection2(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            selection2(arr,r - 1, 0, 0);
        }
    }
}
