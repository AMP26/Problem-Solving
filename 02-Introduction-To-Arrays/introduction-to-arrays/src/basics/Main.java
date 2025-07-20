package basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of the Array: ");
        int n = sc.nextInt();

        int[] result = new int[n]; // Array declaration

        System.out.println("Enter Array Elements: ");
        // Array initialization
        for(int i = 0; i < result.length; i++) {
            System.out.println("Enter Element " + i + ": ");
            result[i] = sc.nextInt();
        }

        System.out.println("\nFunctions: ");
        System.out.println("Press 1: Print Array Elements.");
        System.out.println("Press 2: Enter Index Number to Get Single Element.");
        System.out.println("Press 3: Get Length of the Array.");

        Options opt = new Options();

        System.out.println("Enter Your Choice: ");
        int choice = sc.nextInt();

        opt.chooseOption(result, n, choice);
    }
}

// Time Complexity to get single element: O(1)
// Time Complexity to traverse an array: O(N)
// Space Complexity: O(N)