package reversearray;

public class Solution {

    public void reverseArray(int[] arr) {
        for(int i = 0, j = arr.length - 1; i < j ; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        printUpdatedArray(arr);
    }

    public void reversePartOfArray(int[] arr, int s, int e) {
        for(int i = s, j = e; i < j ; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        printUpdatedArray(arr);
    }

    private void printUpdatedArray(int[] arr) {
        for(int n : arr) { System.out.print(n + " "); }
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)