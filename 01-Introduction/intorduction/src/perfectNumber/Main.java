package perfectNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        Perfect perfectNum = new Perfect(n);
        boolean isPerfect = perfectNum.isPerfect();

        System.out.println("Entered Number is Perfect? " + isPerfect);
    }
}