package equilibriumindex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0}; // Equilibrium Index: 3

        System.out.println("Menu:");
        System.out.println("Press 1: Equilibrium Index Prefix Sum.");
        System.out.println("Press 2: Equilibrium Index No Prefix Sum.");

        Solution sol = new Solution(arr);

        System.out.println("\nEnter Your Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice  = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Equilibrium Index Prefix Sum: ");
                int resultPS = sol.equilibriumIndexPS();
                System.out.println(resultPS);
                break;
            case 2:
                System.out.println("Equilibrium Index No Prefix Sum: ");
                int resultNPS = sol.equilibriumIndex();
                System.out.println(resultNPS);
                break;
            default:
                System.out.println("Invalid Choice! Enter A Valid Option.");
        }
    }
}