package perfectNumber;

public class Perfect {
    private int num;

    public Perfect() { }

    public Perfect(int num) { this.num = num; }

    public boolean isPerfect() {
        int sum = 1;
        for(int i = 2; i * i < num; i++) {
            if(num % i == 0) { sum += i + num / i; }
        }

        if(sum == num) { return true; }

        return false;
    }
}
