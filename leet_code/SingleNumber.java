package leet_code;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            if(!map.containsKey(i)){
                map.put(i , 1);
            }else{
                map.put(i , map.get(i) + 1);
            }
        }
        for (Integer i : map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }

        return -1;
    }
}
