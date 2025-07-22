package rangesum;

public class Solution {
    private int[] arr;
    private int[][] b;

    public Solution() {}

    public Solution(int[] arr, int[][] b) {
        this.arr = arr;
        this.b = b;
    }

    public int[] rangeSum() {
        int[] result = new int[b.length];
        for(int i = 0 ; i < b.length; i++) {
            int sum = sumResult(arr, b[i][0], b[i][1]);
            result[i] = sum;
        }
        return result;
    }

    private int sumResult(int arr[], int s, int e) {
        int sum = 0;
        for(int i = s; i <= e; i++) { sum += arr[i]; }
        return sum;
    }
}
