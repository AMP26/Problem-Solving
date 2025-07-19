package squareRoot;

public class SquareRoot {
    private int num;

    public SquareRoot() { }

    public SquareRoot(int num) { this.num = num; }

    public int rootNum() {
        int left = 1, right = num;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(mid * mid == num) { return mid; }
            else if(mid * mid < num) { left = mid + 1; }
            else { right = mid - 1; }
        }

        return -1;
    }
}
