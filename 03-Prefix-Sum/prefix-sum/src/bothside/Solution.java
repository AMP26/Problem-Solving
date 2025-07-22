package bothside;

public class Solution {

    public int pickSides(int[] arr, int b) {
        int max = Integer.MIN_VALUE;

        int[] prefix = new int[arr.length + 1];

        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }

        int sumL = 0, sumR = 0;
        for(int i = 0 ; i <= b; i++) {
            sumL = prefix[i];
            sumR = prefix[arr.length] - prefix[arr.length - (b - i)];

            max = Math.max(max, (sumL + sumR));
        }
        return max;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)