package basics;

import java.sql.SQLOutput;
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
            System.out.println("Enter Element " + i + ": " + (result[i] = sc.nextInt()));
        }

        System.out.println("Functions: ");
        System.out.println("Press 1: Print Array Elements.");
        System.out.println("Press 2: Enter Index Number to Get Single Element.");
        System.out.println("Press 3: Get Length of the Array.");

        Fundamentals funda = new Fundamentals(result);

        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Array Elements: ");
                funda.printElements();
                break;
            case 2:
                System.out.println("Enter An Index Between 0 & " + (n - 1));
                int idx = sc.nextInt();
                funda.getSingleElement(idx);
                break;
            case 3:
                System.out.println("Length of Array: ");
                funda.getLength();
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }
    }
}

// Time Complexity to get single element: O(1)
// Time Complexity to traverse an array: O(n)