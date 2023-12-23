package leet_code;

public class AddBinary {

    public static void main(String[] args) {

        String a = "1010";
        String b = "1011";

        System.out.println(addBinary(a, b));
    }

    private static String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder(smallString(a, b));
        StringBuilder s2 = new StringBuilder(bigString(a, b));
        for(int i = s.length() ; i < s2.length() ; i++){
            s.insert(0, "0");
        }

        StringBuilder s1 = new StringBuilder();

        int remaining = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            s1.append((Integer.parseInt("" + s.charAt(i)) +
                    Integer.parseInt("" + s2.charAt(i)) + remaining) % 2);

            remaining = (Integer.parseInt("" + s.charAt(i)) +
                    Integer.parseInt("" + s2.charAt(i)) + remaining) / 2;

            if(i == 0 && (Integer.parseInt("" + s.charAt(i)) +
                    Integer.parseInt("" + s2.charAt(i)) + remaining) >= 2){
                s1.append(remaining);
            }
        }

        return s1.reverse().toString();
    }

    private static String bigString(String a, String b) {
        if(a.length() < b.length()){
            return b;
        }
        return a;
    }

    private static String smallString(String a, String b) {
        if(a.length() < b.length()){
            return a;
        }

        return b;
    }
}
