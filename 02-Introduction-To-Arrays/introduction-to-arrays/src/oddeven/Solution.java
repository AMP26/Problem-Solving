package oddeven;

public class Solution {

    public void printOddEven(int[] arr) {
        for(int n : arr) {
            System.out.println("Even Numbers: ");
            if(n % 2 == 0) { System.out.print(n + " "); }
        }

        for(int n : arr) {
            System.out.println("Odd Numbers: ");
            if(n % 2 != 0) { System.out.print(n + " "); }
        }
    }
}
