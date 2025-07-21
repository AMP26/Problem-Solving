package difference;


public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 9, 7, 1, 1, 4, 6, 10};

        Solution sol = new Solution();
        int result = sol.oddEvenDiff(arr);

        System.out.println("Difference of Max Even & Min Odd: " + result);
    }
}
