package elementgreaterthanitself;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {-3, -2, 6, 8, 4, 8, 5, 8};

        Solution sol = new Solution(arr1);
        int result = sol.greaterThanItself();

        System.out.println("Number of elements having at least 1 element greater than itself: " + result);
    }
}