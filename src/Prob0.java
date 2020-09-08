import java.util.Arrays;

public class Prob0 {

    public static void Run() {
        displayArray( makeRandomArray(10, 20) );
    }

    private static int[][] makeRandomArray(int col, int row) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int)(Math.random()*101);
            }
        }
        return arr;
    }

    private static void displayArray(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            System.out.println(Arrays.toString( arr[r]) );
        }
    }

}
