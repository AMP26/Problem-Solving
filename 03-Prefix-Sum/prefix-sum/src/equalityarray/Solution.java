package equalityarray;

public class Solution {

    public int equalityArray(int[] arr) {
        int count = 0, max = -1;

        for (int n : arr) { max = Math.max(max, n); }

        for (int n : arr) {
            if (n == max) { continue; }
            else { count += (max - n); }
        }

        return count;
    }
}
