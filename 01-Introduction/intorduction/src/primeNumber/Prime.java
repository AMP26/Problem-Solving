package primeNumber;

public class Prime {

    private int num;

    public Prime() { }

    public Prime(int num) { this.num = num; }

    public boolean isPrime() {
        int count = 0;
        for(int i = 1; i * i <= num; i++) {
            if(i * i == num) { count += 1; }
            else if(num % i == 0) { count += 2; }
        }

        if(count == 2) { return true; }

        return false;
    }
}
