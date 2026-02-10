package level1Codling;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 0;
        System.out.print("{" + a);
        while (count < 20 ) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(", " + a);
            count++;
        }
        System.out.print("}");
    }
}
