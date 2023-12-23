package leet_code;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SearchRange {

    public static void main(String[] args) {

        int[] array = {1};

        int target = 1;

        int[] range = searchRange(array, target);

        System.out.println(Arrays.toString(range));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(-1);
        stack.add(-1);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                queue.add(i);
                stack.add(i);
            }
        }
        if(queue.size() != 1){
            queue.remove();
        }
        result[0] = queue.peek();
        result[1] = stack.peek();
        return result;
    }
}
