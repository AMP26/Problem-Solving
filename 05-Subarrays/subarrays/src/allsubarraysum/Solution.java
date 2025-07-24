package allsubarraysum;

public class Solution {

    public int allSubarraySum(int[] arr) {
        int totalSum = 0;

        for(int i = 0; i < arr.length; i++) {
            totalSum += (i + 1) * (arr.length - i) * arr[i];
        }
        return totalSum;
    }
}
