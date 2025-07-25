package maxsum;

public class Solution {

    public int maxSum(int[] arr) {
        int maxRes = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxRes = Math.max(maxRes, sum);
            }
        }

        return maxRes;
    }
}
