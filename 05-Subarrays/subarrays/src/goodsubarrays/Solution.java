package goodsubarrays;

public class Solution {
    public int goodSubarray(int[] arr, int b) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            int sum = 0, len = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                ++len;
                if((sum < b && len % 2 == 0) || (sum > b && len % 2 != 0)) {
                    count++;
                }
            }
        }

        return count;
    }
}
