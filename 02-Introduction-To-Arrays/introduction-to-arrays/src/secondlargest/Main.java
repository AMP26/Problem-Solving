package secondlargest;


public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 9, 7, 5, 4, 6, 1, 8};

        Solution sol = new Solution();
        int result = sol.secondLargest(arr);

        System.out.println("Second Largest: " + result);
    }
}