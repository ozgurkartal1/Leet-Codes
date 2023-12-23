package leet_code;

import java.util.HashSet;
import java.util.Set;

public class CommonPrefix {

    public static void main(String[] args) {

        String[] arr = {"flower","flow","flight"};

        String str = commonPrefix(arr);

        System.out.println(str);
    }

    private static String commonPrefix(String[] arr) {
        String commonPrefix = null;
        for (int i = 0; i < arr.length; i++) {
            String previous = commonPrefix;
            commonPrefix = arr[i];
            if(previous == null){
                commonPrefix = arr[i];
            }else{
                StringBuilder s = new StringBuilder();
                int min = Math.min(commonPrefix.length(), previous.length());

                for (int j = 0; j < min; j++) {
                    if(commonPrefix.charAt(j) == previous.charAt(j)){
                        s.append(commonPrefix.charAt(j));
                    }else{
                        break;
                    }
                }
                commonPrefix = s.toString();
            }

        }

        return commonPrefix;
    }
}
