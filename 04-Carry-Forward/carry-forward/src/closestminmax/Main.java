package closestminmax;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 6, 1, 6, 9};

        Solution sol = new Solution();
        int result = sol.closestMinMax(arr);

        System.out.println("Length of the Smallest Sub-array: " + result);
    }
}