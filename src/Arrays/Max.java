package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 45, 18};

        max(arr);
    }

    static void max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < 5; i++) {
            if( arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
