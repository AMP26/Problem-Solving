package binarysearch.floorarray;

public class FloorArray {
    public void binarySearch(int[] nums, int target) {
        System.out.println("Array: [2, 4, 8, 6, 10, 14, 16, 17, 18]\nTarget: " + target);
        int result1 = binarySearchResult(nums, target);
        System.out.println("Ceil Result: " + result1);
    }

    
}
