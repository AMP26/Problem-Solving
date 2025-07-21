package difference;

public class Solution {

    public int oddEvenDiff(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int n : arr) {
            if(n % 2 == 0) { max = Math.max(max, n); }
            else if(n % 2 != 0) { min = Math.min(min, n); }
        }

       return max - min;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)