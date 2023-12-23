package leet_code;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1,1,2};

        int value = removeDuplicates(nums);

        System.out.println(value);
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums){
            list.add(i);
        }
        Set<Integer> set = new HashSet<>(list);

        return set.size();
    }
}
