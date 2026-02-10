package level1Codling;

public class SwapTwoNumbersWithoutOther {

    public static void main(String [] args) {
        int a = 10;
        int b = 12;
        a = a + b; // 22
        b = a - b; // 22 - 12 = 10
        a = a - b; // 22 - 10
        System.out.println(a + ", " + b);
    }
}
