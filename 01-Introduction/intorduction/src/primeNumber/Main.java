package primeNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        Prime primeNum = new Prime(n);
        boolean isPrime = primeNum.isPrime();

        System.out.println("Entered Number is Prime?  " + isPrime);
    }
}

// Time Complexity: O(sqrt(N))
// Space Complexity: O(1)