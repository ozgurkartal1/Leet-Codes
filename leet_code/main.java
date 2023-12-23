package leet_code;

import java.util.*;

public class main {

    public static void main(String[] args) {

        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        ArrayList<String> words = new ArrayList<>(List.of(s.split(" ")));

        if(words.size() != pattern.length()){
            return false;
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < pattern.length(); i++) {
            if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(words.get(i))){
                map.put(pattern.charAt(i), words.get(i));
            }
            str.append(map.get(pattern.charAt(i))).append(" ");
        }

        String s1 = str.toString();
        s1 = s1.trim();

        return s.equals(s1);

    }
}
