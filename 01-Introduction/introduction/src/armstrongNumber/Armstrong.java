package armstrongNumber;

public class Armstrong {
    private int num;

    public Armstrong() { }

    public Armstrong(int num) { this.num = num; }

    public boolean isArmstrong() {
        if(num == 1) { return true; }

        int dup = num;
        int sum = 0;

        while(dup > 0) {
            int digits = dup % 10; // Gets unit digit
            sum += digits * digits * digits;
            dup /= 10; // Removes unit digit
        }

        if(sum == num) { return true; }

        return false;
    }
}
