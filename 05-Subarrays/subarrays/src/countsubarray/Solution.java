package countsubarray;

public class Solution {
    public int countSubarray(int[] arr, int b) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum < b) { count++; }
            }
        }
        return count;
    }
}

// Time Complexity: O(N * N)
// Space Complexity: O(1)