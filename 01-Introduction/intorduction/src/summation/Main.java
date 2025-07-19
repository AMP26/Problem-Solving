package summation;

import primeNumber.Prime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        Summation sum = new Summation(n);
        int numSum = sum.numSum();

        System.out.println("Summation from 1 to "  + n + ": "  + numSum);
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)