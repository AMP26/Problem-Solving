package linearsearch;

public class Solution {

    public boolean linearSearch(int[] arr, int b) {
        for(int n : arr) {
            if(n == b) { return true; }
        }

        return false;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)

