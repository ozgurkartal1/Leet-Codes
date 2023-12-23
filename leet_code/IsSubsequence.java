package leet_code;

import java.util.*;

public class IsSubsequence {

    public static void main(String[] args) {

        String s = "acb";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));

    }

    private static boolean isSubsequence(String s, String t) {

        List<Character> list1 = new ArrayList<>();
        for (char ch : s.toCharArray()){
            list1.add(ch);
        }

        List<Character> list2 = new ArrayList<>();
        for (char ch : t.toCharArray()){
            list2.add(ch);
        }

        list2.retainAll(list1);

        return list1.equals(list2);
    }
}
