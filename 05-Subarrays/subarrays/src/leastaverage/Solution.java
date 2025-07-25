package leastaverage;

public class Solution {

    public int optimizedSol(int[] arr, int b) {
        int index = 0, minSum = 0;

        for(int i = 0; i < b; i++) { minSum += arr[i]; }

        int windowSum = minSum, leastSum = 0;
        for(int i = b; i < arr.length; i++) {
            leastSum += arr[i] - arr[i - b];
            if(windowSum > leastSum) {
                windowSum = leastSum;
                index = i - b + 1;
            }
        }
        return index;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)

    public int bruteForce(int[] arr, int b) {
        int index = 0, minAvg = Integer.MAX_VALUE;

        for(int i = 0 ; i <= arr.length - b; i++) {
            int sum = 0, dupIndex = i, avg = 0;
            for(int j = i; j < b + i; j++) {
                sum += arr[j];
            }
            avg = sum / b;
            if(minAvg > avg) {
                index = dupIndex;
                minAvg = avg;
            }
        }
        return index;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
}
