package leet_code;

import java.util.Stack;

public class isPowerOfTwo {

    public static void main(String[] args) {

        int x = 124;
        System.out.println(isPowerOfTwo1(x));

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.add(2);
        System.out.println(stack);
    }

    private static boolean isPowerOfTwo1(int n) {
        if(n == 0){
            return false;
        }
        while (n != 1){
            if(n % 2 != 0){
                return false;
            }

            n /= 2;
        }

        return true;
    }
}
