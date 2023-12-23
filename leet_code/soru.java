package leet_code;

import java.util.ArrayList;
import java.util.Arrays;

public class soru {

    public static void main(String[] args) {

        int[] nums = {1, 4, 1, 5, 5, 4, 1};

        ArrayList<Integer> indexOf5s = new ArrayList<>();
        ArrayList<Integer> indexOf4s = new ArrayList<>();


        for (int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 4 && nums[i + 1] == 5){
                i++;
            }else if(nums[i] == 5){
                indexOf5s.add(i);
            }else if(nums[i] == 4){
                indexOf4s.add(i);
            }

        }

        for (int i = 0; i < indexOf4s.size(); i++) {
            for (int j = i; j < indexOf5s.size(); j++) {
                int temp = nums[indexOf4s.get(i) + 1];
                nums[indexOf4s.get(i) + 1] = nums[indexOf5s.get(j)];
                nums[indexOf5s.get(j)] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
