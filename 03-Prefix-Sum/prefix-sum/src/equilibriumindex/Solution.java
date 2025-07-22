package equilibriumindex;

public class Solution {
    private int[] arr;

    public Solution() {}

    public Solution(int[] arr) { this.arr = arr; }

    public int equilibriumIndexPS() {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++) { prefix[i] = prefix[i - 1] + arr[i]; }

        for(int i = 0; i < arr.length; i++) {
            int sumL = -1, sumR = -1;
            if(i == 0) { sumL = 0; }
            else if(i == arr.length - 1) { sumR = 0; }
            else {
                sumL = prefix[i - 1];
                sumR = prefix[arr.length - 1] - prefix[i];
            }
            if(sumL == sumR) { return i;}
        }

        return -1;
    }
    // Time Complexity: O(N)
    // Space Complexity: O(N)

    public int equilibriumIndex() {
        int sumR = 0, sumL = 0;

        for(int n : arr) { sumR += n; }

        for(int i = 0; i < arr.length; i++ ) {
            sumL += arr[i];
            if(sumL == sumR) { return i; }
            sumR -= arr[i];
        }

        return -1;
    }
    // Time Complexity: O(N)
    // Space Complexity: O(1)
}

