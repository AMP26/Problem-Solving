package leadersarray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] leaderArray(int[] A) {
        List<Integer> arr = new ArrayList<>();
        int[] rightMax = new int[A.length];

        rightMax[A.length - 1] = A[A.length - 1];
        for(int i = A.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(A[i], rightMax[i + 1]);
        }

        for(int i = 0; i < A.length; i++) {
            if(A[i] >= rightMax[i]) { arr.add(A[i]); }
        }

        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) { result[i] = arr.get(i); }

        return result;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)