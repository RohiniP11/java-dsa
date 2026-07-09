package Stack;

import java.util.Stack;

public class StackOps {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        PushOps(st, 0);
        PushOps(st, 1);
        PushOps(st, 2);
        PushOps(st, 3);

        System.out.println(st.pop());
    }

    static void PushOps(Stack<Integer> st, int A) {
        st.push(A);
    }
}