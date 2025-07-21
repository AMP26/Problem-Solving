package elementgreaterthanitself;

public class Solution {
    private int[] arr;

    public Solution() { }

    public Solution(int[] arr) { this.arr = arr; }

    public int greaterThanItself() {
        int max = Integer.MIN_VALUE;
        for(int n : arr) { max = Math.max(max, n); }

        int count = 0;
        for(int n : arr) { count += (max == n) ? 1 : 0; }

        return arr.length - count;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)