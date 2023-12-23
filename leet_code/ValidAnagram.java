package leet_code;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = createMap(s);
        Map<Character, Integer> map2 = createMap(t);

        return map1.equals(map2);
    }

    private static Map<Character, Integer> createMap(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : s.toCharArray()){
            if(!result.containsKey(ch)){
                result.put(ch, 1);
            }else{
                result.put(ch, result.get(ch) + 1);
            }
        }
        return result;
    }
}
