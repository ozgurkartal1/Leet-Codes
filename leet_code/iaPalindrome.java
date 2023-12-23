package leet_code;

public class iaPalindrome {

    public static void main(String[] args) {

        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String str = "" + x;
        return str.equals(reversed(str));
    }

    public static String reversed(String str) {
        StringBuilder reverse = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            reverse.append(str.charAt(i));
        }

        return reverse.toString();
    }
}
