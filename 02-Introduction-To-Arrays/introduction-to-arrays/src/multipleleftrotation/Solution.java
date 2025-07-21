package multipleleftrotation;

public class Solution {
    public int[][] multipleLeftRotation(int[] A, int[] B) {
        int[][] result = new int[B.length][A.length];
        int m = 0;

        for(int i = 0; i < B.length; i++ ) {
            int[] dup = A.clone();

            B[i] %= A.length;
            int n = A.length - 1;

            reverseArray(dup, 0, n);
            reverseArray(dup, 0, n - B[i]);
            reverseArray(dup, A.length - B[i], n);

            result[m++] = dup;
        }
        return result;
    }

    private void reverseArray(int[] arr, int s, int e) {
        for(int i = s, j = e; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

// Time Complexity	O(M × N)
// Space Complexity	O(M × N)