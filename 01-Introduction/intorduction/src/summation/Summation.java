package summation;

public class Summation {

    private int num;

    public Summation() {}

    public Summation(int num) { this.num = num; }

    public int numSum() {
        return num * (num + 1) / 2;
    }
}
