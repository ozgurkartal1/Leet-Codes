package leet_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {

        String s = "()(())()(())()()(((())))(()()";

        int value = longestValidParentheses(s);

        System.out.println(value);
    }

    public static int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Boolean> stack1 = new Stack<>();
        char[] array = s.toCharArray();

        for (char ch : array) {
            boolean b = false;
            if (ch == '(' || ch == '[' || ch == '{') {
                b = true;
                stack.add(ch);
                stack1.add(false);
            } else {
                if (!stack.isEmpty() && isMatched(stack.pop(), ch)) {
                    b = true;
                    for (int i = stack1.size() - 1; i >= 0; i--) {
                        if (!stack1.get(i)) {
                            stack1.set(i, true);
                            break;
                        }
                    }
                }
            }
            if(!b){
                stack1.add(false);
            }
        }
        return length(stack1) * 2;
    }

    private static int length(Stack<Boolean> stack1) {
        int count = 0;
        int max = 0;
        for (boolean b : stack1){
            if(b){
                count++;
            }else{
                if(count > max){
                    max = count;
                }
                count = 0;
            }
        }
        if(count > max){
            max = count;
        }
        return max;
    }
    public static boolean isMatched(Character peek, char ch) {
        if(peek == '(' && ch == ')'){
            return true;
        }

        if(peek == '[' && ch == ']'){
            return true;
        }

        return peek == '{' && ch == '}';
    }

}
