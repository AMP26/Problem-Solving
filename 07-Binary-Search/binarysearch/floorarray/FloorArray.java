package binarysearch.floorarray;

public class FloorArray {
    public void binarySearch(int[] nums, int target) {
        System.out.println("Array: [2, 4, 8, 6, 10, 14, 16, 17, 18]\nTarget: " + target);
        int result1 = binarySearchResult(nums, target);
        System.out.println("Ceil Result: " + result1);
    }

    private int binarySearchResult(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while(start <= end) {
            int mid = start + ( end - start) / 2;
            if(nums[mid] == target) { return mid; }
            else if(nums[mid] < target) { start = mid + 1; }
            else { end = mid - 1; }
        }
        return end;
    }
}
