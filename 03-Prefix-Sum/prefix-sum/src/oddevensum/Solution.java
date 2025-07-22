package oddevensum;

public class Solution {
    private int[] arr;

    public Solution() {}

    public Solution(int[] arr) { this.arr = arr; }


    public int[] evenSum(){
        int[] resultEven = new int[arr.length];
        resultEven[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(i % 2 != 0) {
                resultEven[i] = resultEven[i - 1];
            }
            else {
                resultEven[i] = resultEven[i - 1] + arr[i];
            }
        }
        return resultEven;
    }

    public int[] oddSum(){
        int[] resultOdd = new int[arr.length];
        resultOdd[1] = arr[1];
        for(int i = 2; i < arr.length; i++) {
            if(i % 2 == 0) {
                resultOdd[i] = resultOdd[i - 1];
            }
            else {
                resultOdd[i] = resultOdd[i - 1] + arr[i];
            }
        }
        return resultOdd;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)