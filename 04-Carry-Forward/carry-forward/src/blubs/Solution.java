package blubs;

public class Solution {
    public int bulbs(int[] arr) {
        int switchPress = 0, state = 0;

        for(int i = 0; i < arr.length; i++) {
            if(switchPress % 2 == 0) { state = arr[i]; }
            else { state = 1 - arr[i]; }

            if(state == 0) { switchPress++; }
        }
        return switchPress;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)