package leet_code;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> list = threeSum(nums);

        System.out.println(list);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                for(int k = j + 1 ; k < nums.length ; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0){
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        Collections.sort(list1);
                        set.add(list1);
                    }
                }
            }
        }
        ArrayList<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}
