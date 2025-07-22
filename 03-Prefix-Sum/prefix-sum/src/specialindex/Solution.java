package specialindex;

public class Solution {
    public int specialIndex(int[] arr) {
        int[] oddPS = new int[arr.length];
        int[] evenPS = new int[arr.length];

        // Prefix Sum:  Odd & Even
        evenPS[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenPS[i] = evenPS[i - 1] + arr[i];
                oddPS[i] = oddPS[i - 1];
            } else {
                oddPS[i] = oddPS[i - 1] + arr[i];
                evenPS[i] = evenPS[i - 1];
            }
        }

        int sumO = 0, sumE = 0, n = arr.length - 1, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sumO = evenPS[n] - oddPS[i];
                sumE = oddPS[n] - evenPS[i];
            } else {
                sumO = oddPS[i - 1] + (evenPS[n] - evenPS[i]);
                sumE = evenPS[i - 1] + (oddPS[n] - oddPS[i]);
            }
            count += (sumO == sumE) ? 1 : 0;
        }

        return count;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)