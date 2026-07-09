package Linear_Search;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Rohini";
        char target = 'o';
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }



    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {  //str.toCharArray() Converts the whole string into a character array (char[]).
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) { //str.charAt(i) Returns the character at a specific index i in the string.
                return true;
            }
        }
        return false;
    }


}

