package closestminmax;

public class Solution {
    public int closestMinMax(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int n : arr) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        int currMin = -1, currMax = -1, result = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) { currMax = i; }
            else if(arr[i] == min) { currMin = i; }

            if(currMax != -1 && currMin != -1) {
                result = Math.min(result, Math.abs(currMax - currMin + 1));
            }
        }

        return result;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)