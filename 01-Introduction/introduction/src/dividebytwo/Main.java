package dividebytwo;

import squareRoot.SquareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        Divide d = new Divide(n);
        int div = d.byTwo();

        System.out.println("Number of Times Divide a Number by 2 Until 1: " + div);
    }
}

// Time Complexity: O(log(N))
// Space Complexity: O(1)