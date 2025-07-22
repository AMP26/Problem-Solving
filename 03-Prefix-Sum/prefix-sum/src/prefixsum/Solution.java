package prefixsum;

public class Solution {

    public int[] prefixSum(int[] arr) {
        int[] result = new int[arr.length];

        result[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            result[i] = result[i - 1] + arr[i];
        }

        return result;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)
