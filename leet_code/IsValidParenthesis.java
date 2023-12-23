package leet_code;

import java.util.Stack;

public class IsValidParenthesis {

    public static void main(String[] args) {

        String parenthesis = "()[[]()]";

        System.out.println(isValid(parenthesis));
    }

    public static boolean isValid(String parenthesis) {
        Stack<Character> stack = new Stack<>();
        for (char ch : parenthesis.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.add(ch);
            }else{
                if(stack.isEmpty() || !isMatched(ch, stack.pop())){
                   return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatched(char ch, Character pop) {
        if(pop == '(' && ch == ')'){
            return true;
        }

        if(pop == '[' && ch == ']'){
            return true;
        }

        return pop == '{' && ch == '}';
    }
}
