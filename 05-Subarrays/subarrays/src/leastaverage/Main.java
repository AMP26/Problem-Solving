package leastaverage;


public class Main {
    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;

        Solution sol = new Solution();
        int index1 = sol.bruteForce(A, B);
        int index2 = sol.optimisedSol(A, B);

        System.out.println("Brute Force Approach: ");
        System.out.println("Start Index of Subarray with Least Average: " + index1);

        System.out.println("");

        System.out.println("Optimised Approach: ");
        System.out.println("Start Index of Subarray with Least Average: " + index2);
    }
}
