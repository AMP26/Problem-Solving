package linearsearch;


public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 6, 1, 7, 9, 2, 10};
        int b = 2;

        Solution sol = new Solution();
        boolean result = sol.linearSearch(arr, b);

        System.out.println("Is " + b + " present in the Array? " + result); 
    }
}
