package basics;

public class Fundamentals {
    private int[] arr;

    public Fundamentals() { }

    public Fundamentals(int[] arr) { this.arr = arr; }

    public void printElements() {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

    public int getSingleElement(int index) {
        return arr[index];
    }

    public int getLengthOfArray() {
        return arr.length;
    }
}
