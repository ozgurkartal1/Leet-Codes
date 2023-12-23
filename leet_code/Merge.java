package leet_code;

import java.util.Scanner;

public class Merge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] n = new double[5];
        double[] m = new double[5];

        for (int i = 0; i < m.length + n.length; i++) {
            if(i == 0){
                System.out.print("Enter first list : ");
            }
            if(i < 5){
                m[i] = input.nextDouble();
            }
            if(i == 5){
                System.out.print("Enter second list : ");
            }
            if(i >= 5){
                n[i- 5] = input.nextDouble();
            }

        }

        double[] mergedArray = merge(m, n);

        display(mergedArray);
    }

    private static double[] merge(double[] m, double[] n) {
        m = createArrayWithout0s(m);
        n = createArrayWithout0s(n);

        int lengthOfResult = m.length + n.length;

        double[] result = new double[lengthOfResult];

        for (int i = 0; i < result.length; i++) {
            if(i < m.length){
                result[i] = m[i];
            }else{
                result[i] = n[i - m.length];
            }
        }

        sort(result);

        return result;
    }

    private static void sort(double[] result) {
        int minIndex = 0;

        while(minIndex < result.length){
            double min = result[minIndex];
            int index = minIndex;
            for (int i = minIndex + 1; i < result.length; i++) {
                if(result[i] < min){
                    min = result[i];
                    index = i;
                }
            }
            if(index != minIndex){
                result[index] = result[minIndex];
                result[minIndex] = min;
            }

            minIndex++;

        }
    }

    private static double[] createArrayWithout0s(double[] m) {
        int length = calculateLength(m);
        double[] result = new double[length];
        int count = 0;
        for (int i = 0 ; i < m.length; i++){
            if(m[i] != 0){
                result[count] = m[i];
                count++;
            }
        }

        return result;
    }

    private static int calculateLength(double[] m) {
        int result = 0;
        for (double d : m){
            if(d != 0){
                result++;
            }
        }

        return result;
    }

    private static void display(double[] mergedArray) {
        for (double d : mergedArray){
            System.out.print(d + " ");
        }

    }

}
