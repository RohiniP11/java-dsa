package Recusrion_Problems.String;

public class Stream {
    public static void main(String[] args) {
        //skip("", "baccadah");
        String ans = skipappNotApple("bappleah");
        System.out.println(ans );
    }

    static void skip(String p, String up) {
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1)); //new up is creating,
        }
    }

    static String skipreturn(String up) {
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skipreturn(up.substring(1));
        } else {
            return ch + skipreturn(up.substring(1));
        }
    }

    static String skipapple(String up) {
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")) {
            return skipapple(up.substring(5));
        } else {
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }

    static String skipappNotApple(String up) {
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipappNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipappNotApple(up.substring(1));
        }
    }
}