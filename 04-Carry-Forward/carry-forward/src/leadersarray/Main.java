package leadersarray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        Solution sol = new Solution();
        int[] result = sol.leaderArray(arr);

        System.out.println("Result: ");
        for(int n : result) { System.out.print(n + " "); }
    }
}
