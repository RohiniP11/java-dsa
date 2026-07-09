package Linear_Search;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, -3, 16, -11, 28};
        int target = 1;
        int ans = linearSearch(nums, target);
        System.out.print(ans);
        System.out.println();
        int ans2 = linearSearch2(nums, target);
        System.out.print(ans2);

    }

    //search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        //run for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the states above have executed
        //hence is target not found

        return false;
    }


    //search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

            //run for loop
            for (int element : arr) {
                if (element == target) {
                    return element;
                }
            }
            //this line will execute if none of the states above have executed
            //hence is target not found

        return Integer.MAX_VALUE;  //will return 2147483647
    }


    //search the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        //this line will execute if none of the states above have executed
        //hence is target not found
        return -1;
    }

}
