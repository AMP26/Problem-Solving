package evensubarray;


public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 7, 6};

        Solution sol = new Solution();
        boolean isPossible = sol.evenSubarrays(arr);

        System.out.println("Is Even Sub-array Possible: " + isPossible);
    }
}
