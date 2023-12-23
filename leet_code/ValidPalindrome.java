package leet_code;

import java.util.Arrays;

public class ValidPalindrome {

    public static void main(String[] args) {

        String s = "`l;`` 1o1 ??;l`";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String[] arr = s.split("[\\s._;}/:@#'`?!{)(\\[\\]\\\\<>+*=,\"\\-]+");
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (String s3 : arr){
            s1.append(s3);
        }

        for (int i = arr.length - 1; i >= 0 ; i--) {
            for (int j = arr[i].length() - 1; j >= 0 ; j--) {
                s2.append(arr[i].charAt(j));
            }
        }

        return s1.compareTo(s2) == 0;
    }
}
