package minmax;

public class Solution {

    public void minMax(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int n : arr) {
            if(min > n) { min = n; }
            if(max < n) { max = n; }
        }
        System.out.println("Maximum: " + max + " & " + "Minimum: " + min);
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
