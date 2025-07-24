package allsubarrays;

public class Solution {
    public void printAllSubarrays(int[] arr) {
        for(int i = 0 ; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                printSubarray(arr, i, j);
            }
        }
    }

    private void printSubarray(int[] arr, int start, int end) {
        while(start <= end) {
            System.out.print(arr[start++] + " ");
        }
        System.out.println("");
    }
}

// Time Complexity: O(N * N * N)
// Space Complexity: O(1)