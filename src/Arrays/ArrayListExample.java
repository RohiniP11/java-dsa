package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
          ArrayList<Integer> list = new ArrayList<>(10);
//
//        list.add(67);
//        list.add(34);
//        list.add(56);
//        list.add(78);
//        list.add(89);
//        list.add(23);
//        list.add(88);
//        list.add(9887);
//
//        System.out.println(list.contains(78));
//        System.out.println(list.contains(0));
//
//        System.out.println(list);
//
//        list.set(0, 99);
//        list.remove(2);
//
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }


        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass idex here, list[index] syntax will not work here
        }

        System.out.println(list);
    }
}
