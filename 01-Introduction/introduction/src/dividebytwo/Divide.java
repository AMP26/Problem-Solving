package dividebytwo;

public class Divide {
    private int num;

    public Divide() { }

    public Divide(int num) { this.num = num; }

    public int byTwo() {
        int count = 0;
        int dup = num;

        while(dup >= 1) {
            if(dup == 1) { break; }
            dup /= 2;
            count++;
        }

        return count;
    }
}
