package twosum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 7;

        Solution sol = new Solution();

        int[] result = sol.twoSum(arr, target);

        System.out.println("Indices: ");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] +" ");
        }
    }
}
