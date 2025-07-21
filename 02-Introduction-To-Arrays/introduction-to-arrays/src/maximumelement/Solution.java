package maximumelement;

import java.util.Arrays;

public class Solution {

    public int minOperations(int[] A, int B) {
        int count = 0, flag = 0;
        for(int n : A) {
            if(n == B) { flag = 1; }
            if(n > B) { count++; }
        }

        int result = (flag == 1) ? count : -1;
        return result;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
