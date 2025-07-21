package oddeven;

public class Solution {

    public void printOddEven(int[] arr) {
        System.out.println("Even Numbers: ");
        for(int n : arr) {
            if(n % 2 == 0) { System.out.print(n + " "); }
        }

        System.out.println("\nOdd Numbers: ");
        for(int n : arr) {
            if(n % 2 != 0) { System.out.print(n + " "); }
        }
    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)
