package maximumelement;

import java.util.Arrays;

public class Solution {

    public int minOperations(int[] A, int B) {
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++) {
            if(A[i] == B) { return A.length - (i + 1); }
        }
        return -1;
    }
}
