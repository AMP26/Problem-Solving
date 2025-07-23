package evensubarray;

public class Solution {
    public boolean evenSubarrays(int[] arr) {

        if(arr.length % 2 != 0 && arr[0] != 0 && arr[arr.length - 1] % 2 != 0) { return false; }

        return true;
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)