package level1Codling;

public class PrimeNumber {
    public static void main(String[] args) {
        int a = 100;
        boolean isPrime = true;
        int b = a;
        while(isPrime) {
            b--;
            if (a < 4 || b == 1) {
                break;
            }
            if (a % b == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}
