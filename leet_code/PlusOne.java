package leet_code;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;

public class PlusOne {

    public static void main(String[] args) {

        int[] digits = new int[20];

        for (int i = 0; i < digits.length; i++) {
            if(i > 15){
                digits[i] = 9;
            }else{
                int number = (int) (Math.random() * 10);
                digits[i] = number;
            }
        }

        System.out.println(Arrays.toString(digits));

        int[] array = plusOne(digits);

        System.out.println(Arrays.toString(array));
    }

    private static int[] plusOne(int[] digits) {
        StringBuilder s = new StringBuilder();
        for (int i : digits){
            s.append(i);
        }

        BigInteger bigInteger = new BigInteger(s.toString());
        bigInteger = bigInteger.add(BigInteger.ONE);

        Stack<Integer> stack = new Stack<>();

        while(!bigInteger.equals(BigInteger.ZERO)){
            stack.add(bigInteger.remainder(new BigInteger("10")).intValue());
            bigInteger = bigInteger.divide(new BigInteger("10"));
        }

        int[] result = new int[stack.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }

        return result;
    }
}
