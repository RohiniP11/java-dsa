package Recusrion_Problems.Array;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 9, 3, 5};

        //System.out.println(find(arr, 1, 0));
        System.out.println(FindIndex(arr, 1, 0));
        FindIndexList(arr, 9, 0);
        System.out.println(list);
        ArrayList<Integer> ans = FindIndexList(arr, 9, 0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(FindIndexList2(arr, 9, 0));
    }

    static boolean find(int[] arr,int target,int index) {
        if (index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    static int FindIndex(int[] arr,int target,int index) {
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return FindIndex(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void FindIndexList(int[] arr,int target,int index) {
        if (index == arr.length){
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        FindIndexList(arr, target, index + 1);
    }

    static ArrayList<Integer> FindIndexList(int[] arr,int target,int index, ArrayList<Integer> list) {
        if (index == arr.length){
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return FindIndexList(arr, target, index + 1, list);
    }

    static ArrayList<Integer> FindIndexList2(int[] arr,int target,int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = FindIndexList2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }

}
