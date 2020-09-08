import java.util.Arrays;

public class Prob2 {
    private static int[][] array = new int[10][10];

    public static void Run() {
        initArray();
        displayArray( array );
        System.out.println( "[0][0]: "  + sumOfNeighbors(array, 0, 0) );  // inside, expecting 2
        System.out.println( "[2][2]: "  + sumOfNeighbors(array, 2, 2) );  // inside, expecting 16
        System.out.println( "[10][9]: " + sumOfNeighbors(array, 9, 10) ); // outside, expecting 0
    }

    private static void initArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = i + j;
            }
        }
    }

    private static int sumOfNeighbors(int[][] array, int r, int c) {
        if ( !isInBound(array, r, c) ) {
            return 0;
        }
        int sum = 0;
        sum += r-1 >= 0              ? array[r-1][c] : 0;
        sum += r+1 < array.length    ? array[r+1][c] : 0;
        sum += c-1 >= 0              ? array[r][c-1] : 0;
        sum += c+1 < array[0].length ? array[r][c+1] : 0;
        return sum;
    }

    private static boolean isInBound(int[][] arr, int r, int c) {
        return r >= 0 && r < arr.length && c >=0 && c < arr[0].length;
    }

    private static void displayArray(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            System.out.println(Arrays.toString( arr[r]) );
        }
    }
}
