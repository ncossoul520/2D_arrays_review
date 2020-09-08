public class Prob1 {
    private static int[][] arr = new int[10][10];

    public static void Run() {
        System.out.println( isInBound(arr, 3, 5) );   // true
        System.out.println( isInBound(arr, -1, 5) );  // false
        System.out.println( isInBound(arr, 10, 9) ); // false
    }

    private static boolean isInBound(int[][] arr, int r, int c) {
        return r >= 0 && r < arr.length && c >=0 && c < arr[0].length;
    }
}
