package squareRoot;

import primeNumber.Prime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        SquareRoot sq = new SquareRoot(n);
        int sqrt = sq.rootNum();

        System.out.println("Square Root of a Number (if exists): " + sqrt);
    }
}

// Time Complexity: O(log(N))
// Space Complexity: O(1)