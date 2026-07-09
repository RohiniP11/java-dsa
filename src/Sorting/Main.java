package Sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {9,3,5,1,7};
        System.out.println("Array :");
        System.out.println(Arrays.toString(arr));
        //bubble(arr);
        //selection(arr);
        //insertion(arr);
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
        // run the step n-1 times
        boolean swapped;
        for(int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minIdx = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    static void insertion(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 &&  arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    static void merge(int[] arr) {
         
    }
}
