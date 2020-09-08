import java.util.Arrays;

public class Prob3 {
    private static boolean[][] input_arr = new boolean[5][5];

    public static void Run() {
        initArray();
        displayArray( input_arr );

        int[][] output_arr = makeContactGrid( input_arr );
        displayArray( output_arr );
    }


    private static void initArray() {
        for (int i = 0; i < input_arr.length; i++) {
            for (int j = 0; j < input_arr[0].length; j++) {
                input_arr[i][j] = false;
            }
        }
        input_arr[1][1] = true;
        input_arr[2][1] = true;
        input_arr[3][3] = true;
    }


    private static int[][] makeContactGrid(boolean[][] input_arr) {
        int[][] res_arr = new int[ input_arr.length ][ input_arr[0].length ];
        for (int r = 0; r < input_arr.length; r++) {
            for (int c = 0; c < input_arr[0].length; c++) {
                res_arr[r][c] = sumOfNeighbors(input_arr, r, c);
            }
        }
        return res_arr;
    }


    private static int sumOfNeighbors(boolean[][] array, int r, int c) {
        if ( !isInBound(array, r, c) ) {
            return 0;
        }
        int sum = 0;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if ( isInBound(array, r+dr, c+dc) ) {
                    sum += array[r+dr][c+dc] ? 1 : 0;
                }
            }
        }
        return sum;
    }


    private static boolean isInBound(boolean[][] arr, int r, int c) {
        return r >= 0 && r < arr.length && c >=0 && c < arr[0].length;
    }


    private static void displayArray(boolean[][] output_arr) {
        for (int r = 0; r < output_arr.length; r++) {
            System.out.println(Arrays.toString( output_arr[r]) );
        }
    }

    private static void displayArray(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            System.out.println(Arrays.toString( arr[r]) );
        }
    }
}
