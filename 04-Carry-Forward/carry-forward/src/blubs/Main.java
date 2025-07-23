package blubs;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1};

        Solution sol = new Solution();
        int result = sol.bulbs(arr);

        System.out.println("Minimum number of switches you have to press to turn on all the bulbs: " + result);
    }
}
