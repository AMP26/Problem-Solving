package oddevensum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println("Menu: ");
        System.out.println("Press 1: Even Prefix Sum.");
        System.out.println("Press 2: Odd Prefix Sum.");

        Solution sol = new Solution(arr);

        System.out.println("\nEnter Your Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice  = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Even Prefix Sum: ");
                int[] resultEven = sol.evenSum();
                printArray(resultEven);
                break;
            case 2:
                System.out.println("Odd Prefix Sum: ");
                int[] resultOdd = sol.oddSum();
                printArray(resultOdd);
                break;
            default:
                System.out.println("Invalid Choice! Enter A Valid Option.");
        }
    }

    private static void printArray(int[] arr) {
        for(int n : arr) { System.out.print(n + " "); }
    }
}
