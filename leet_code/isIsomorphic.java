package leet_code;

import java.util.*;

public class isIsomorphic {

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic1(s, t));
    }

    public static boolean isIsomorphic1(String s, String t){
        Map<Character, Character> map = new TreeMap<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
            }
        }

        StringBuilder str = new StringBuilder();

       for (char ch : s.toCharArray()){
           str.append(map.get(ch));
       }

       return isDuplicate(map, map.keySet()) && t.contentEquals(str);
    }

    private static boolean isDuplicate(Map<Character, Character> map, Set<Character> characters) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character ch : characters){
            list.add(map.get(ch));
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)){
                    return false;
                }
            }
        }

        return true;
    }
}
