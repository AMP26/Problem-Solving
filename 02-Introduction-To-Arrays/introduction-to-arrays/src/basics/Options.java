package basics;

import java.util.Scanner;

public class Options {

    Scanner sc = new Scanner(System.in);

    private int[] arr;
    private int len;

    public Options() { }

//    public Options(int[] arr, int len) {
//        this.arr = arr;
//        this.len = len;
//    }

    public void chooseOption(int[] arr, int len, int choice) {
        Fundamentals funda = new Fundamentals(arr);
        switch(choice) {
            case 1:
                System.out.println("Array Elements: ");
                funda.printElements();
                break;
            case 2:
                System.out.println("Enter An Index Between 0 & " + (len - 1));
                int idx = sc.nextInt();
                funda.getSingleElement(idx);
                break;
            case 3:
                System.out.println("Length of Array: ");
                funda.getLengthOfArray();
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }
    }
}
