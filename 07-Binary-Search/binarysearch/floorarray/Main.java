package binarysearch.floorarray;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 4, 8, 6, 10, 14, 16, 17, 18};
        int target = 12;

        FloorArray ca = new FloorArray();
        ca.binarySearch(nums, target);
    }
} 