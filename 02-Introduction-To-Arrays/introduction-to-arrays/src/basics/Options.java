package basics;

import java.util.Scanner;

public class Options {

    Scanner sc = new Scanner(System.in);

    private int[] arr;
    private int len;
    private Fundamentals funda;

    public Options() { }

    public Options(int[] arr, int len) {
        this.arr = arr;
        this.len = len;
        this.funda = new Fundamentals(arr);
    }

    public void chooseOption(/*int[] arr, int len,*/ int choice) {

        switch(choice) {
            case 1:
                System.out.println("Array Elements: ");
                funda.printElements();
                break;
            case 2:
                System.out.println("Enter An Index Between 0 & " + (len - 1));
                int idx = sc.nextInt();
                int element = funda.getSingleElement(idx);
                System.out.println("Element at Index " + idx + ": " + element);
                break;
            case 3:
                System.out.println("Length of Array: ");
                int size = funda.getLengthOfArray();
                System.out.println("Length of Array: " + size);
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }
    }
}
