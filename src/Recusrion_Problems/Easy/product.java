package Recusrion_Problems.Easy;

public class product {
    public static void main(String[] args) {

        int ans = prod(1342);
        System.out.println(ans);
    }

    static int prod(int n) {
        if (n%10 == n) {
            return n;
        }

        return (n%10) * prod(n/10);
    }

    //concept
    static void fun(int n) {
        if (n == 0){
            return;
        }

        System.out.println(n);
        fun(--n);
        //n-- vs --n
        //fun(n--); infinite 5's only
    }
}
