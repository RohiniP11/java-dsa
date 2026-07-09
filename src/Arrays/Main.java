package Arrays;

public class Main {
    public static void main(String[] args) {
        //Q: store a roll number
        int a = 90;

        //Q: store a person's name

        //syntax
        //datatype[] variable_name = new datatype[size];

        //int[] rnos = new int[5];
        //or
        //int[] rnos2 = {23, 12, 45, 35, 15};

        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[5]; //initialisation: actually here object is being created in the memory (heap)
        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

//        for (String element : arr) {  //enhanced for loop
//            System.out.println(element);
//        }


    }

}
