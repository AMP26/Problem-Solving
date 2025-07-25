package maxsubarray;

public class Solution {
    public int maxSubarray(int a, int b, int[] arr) {
        int maxSum = 0;
        for(int  i = 0 ; i < a; i++) {
            int sum = 0;
            for(int j = i; j < a; j++) {
                sum += arr[j];
                if(sum <= b && maxSum < sum){ maxSum = sum; }
            }
        }
        return maxSum;
    }
}

// Time Complexity: O(N * N)
// Space Complexity:O(1)
