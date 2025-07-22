package productpuzzle;

public class Solution {

    public int[] productArray(int[] arr) {
        int[] result = new int[arr.length];
        int mul = 1;
        for(int n : arr) { mul *= n; }

        for(int i = 0; i < arr.length; i++) { result[i] = mul / arr[i]; }
        return result;
    }
}
