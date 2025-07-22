package productpuzzle;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Solution sol = new Solution();
        int[] result = sol.productArray(arr);

        System.out.println("Resultant Array: ");
        for(int n : result) { System.out.print(n + " "); }
    }
}
