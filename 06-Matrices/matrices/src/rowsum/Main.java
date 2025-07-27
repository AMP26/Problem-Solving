package rowsum;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,2,3,4}};

        Solution sol = new Solution();
        int[] result = sol.rowSum(arr);
        
        for(int i : result) { System.out.print(i + " "); }
    }
}
