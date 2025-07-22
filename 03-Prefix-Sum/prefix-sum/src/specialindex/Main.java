package specialindex;


public class Main {
    public static void main(String[] args) {

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr = {2, 1, 6, 4};
          int[] arr = {1, 1, 1};

        Solution sol = new Solution();
        int count = sol.specialIndex(arr);

        System.out.println("Number of Special Index: " + count);
    }
}
