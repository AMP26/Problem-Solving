package rotatearray;

public class Solution {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length - 1;
        k %= n;

        reverseArray(nums, 0, n);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n);

        printArray(nums);
    }

    private void reverseArray(int[] arr, int s, int e) {
        for(int i = s, j = e; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    private void printArray(int[] arr) {
        System.out.println("Resultant Array: ");
        for(int a : arr) { System.out.print(a + " "); }
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
