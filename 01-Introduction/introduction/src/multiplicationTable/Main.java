package multiplicationTable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("Generated Multiplication Table: ");
        Multiplication mul = new Multiplication(n);
        mul.generateTable();
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)