package multiplicationTable;

public class Multiplication {
    private int num;

    public Multiplication() { }

    public Multiplication(int num) { this.num = num; }

    public void generateTable() {
        for(int i = 1; i <= 20; i++) {
            System.out.println(num +" x " + i + " = " + (num * i));
        }
    }
}
