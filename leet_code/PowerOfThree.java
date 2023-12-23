package leet_code;

public class PowerOfThree {

    public static void main(String[] args) {

        int x = 8;
        System.out.println(isPowerOfThree(x));
    }

    private static boolean isPowerOfThree(int x) {
        if(x == 0 || x == 1){
            return true;
        }
        for (int i = 1; i <= x / (int)Math.sqrt(x); i++) {
            if(x % i == 0 && (int)(Math.pow(i, 3)) == x){
                System.out.println(i);
                return true;
            }
        }
        return false;
    }
}
