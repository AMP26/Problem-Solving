package diagonalsum;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, -2, -3}, {-4, 5, -6},  {-7, -8, 9}};

        Solution sol = new Solution();
        int resultMain = sol.mainDiagonalSum(arr);
        int resultMinor = sol.minorDiagonalSum(arr);

        System.out.println("Main Diagonal Sum Result: " + resultMain);
        System.out.println("Minor Diagonal Sum Result: " + resultMinor);
    }
}
