package reversearray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);

        Solution sol = new Solution();

        System.out.println("Menu:");
        System.out.println("Press 1: Reverse Full Array.");
        System.out.println("Press 2: Reverse Part Of The Array.");

        System.out.println("\nEnter Your Choice:");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                sol.reverseArray(arr);
                break;
            case 2:
                int s = 2, e = 6;
                sol.reversePartOfArray(arr, s, e);
                break;
            default:
                System.out.println("Enter A Valid Choice");
        }
    }
}