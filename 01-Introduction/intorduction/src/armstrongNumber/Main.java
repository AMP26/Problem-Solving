package armstrongNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        Armstrong a = new Armstrong(n);
        boolean isArmstrong = a.isArmstrong();

        System.out.println("Entered Number is Armstrong? " + isArmstrong);
    }
}

// Time Complexity: O(log(N)
// Space Complexity: O(1)