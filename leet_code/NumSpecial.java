package leet_code;

public class NumSpecial {

    public static void main(String[] args) {

        int[][] mat =  {{0,0,1,0},{0,0,0,0},{0,0,0,0}, {0,1,0,0}};
        System.out.println(numSpecial(mat));
    }

    private static int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1){
                    if(rowControl(mat, i) && columnControl(mat, j)){
                        count++;
                    }
                }

            }
        }

        return count;
    }

    private static boolean columnControl(int[][] mat, int i) {
        int count = 0;
        for (int j = 0; j < mat.length; j++) {
            if(mat[j][i] == 1){
                count++;
            }
        }

        return count == 1;
    }

    private static boolean rowControl(int[][] mat, int j) {
        int count = 0;
        for (int i = 0; i < mat[j].length; i++) {
            if(mat[j][i] == 1){
                count++;
            }
        }

        return count == 1;
    }


}
