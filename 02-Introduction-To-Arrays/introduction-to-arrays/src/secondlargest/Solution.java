package secondlargest;

public class Solution {

    public int secondLargest(int[] arr) {
        if(arr.length == 1) { return -1; }

        int max = Integer.MIN_VALUE, sMax = Integer.MIN_VALUE;
        for(int n : arr) {
            if(max < n) {
                sMax = max;
                max = n;
            }
            else if(n > sMax && n < max) { sMax = n; }
        }
        return sMax == Integer.MIN_VALUE ? -1 : sMax;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
