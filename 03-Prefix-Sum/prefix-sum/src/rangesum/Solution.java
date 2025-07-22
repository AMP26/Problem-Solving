package rangesum;

public class Solution {
    private int[] arr;
    private int[][] b;

    public Solution() {}

    public Solution(int[] arr, int[][] b) {
        this.arr = arr;
        this.b = b;
    }

    public long[] rangeSum() {
        long[] result = new long[b.length];
        for(int i = 0 ; i < b.length; i++) {
            long sum = sumResult(arr, b[i][0], b[i][1]);
            result[i] = sum;
        }
        return result;
    }

    private long sumResult(int[] arr, int s, int e) {
        long sum = 0;
        for(int i = s; i <= e; i++) { sum += arr[i]; }
        return sum;
    }
}
