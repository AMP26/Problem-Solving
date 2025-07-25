package maxsum;

public class Solution {

    public int maxSum(int[] arr) {
        int maxRes = Integer.MIN_VALUE, sum = 0;

        for(int n : arr) {
            sum += n;
            maxRes = Math.max(sum, maxRes);
            if(sum < 0) { sum = 0; }
        }

        return maxRes;
    }
}
