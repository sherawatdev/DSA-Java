package level1Codling;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 2345671;
//        StringBuilder sb = new StringBuilder();
//        String s = Integer.toString(num);
//        char[] arr = s.toCharArray();
//        for (int i = s.length() - 1; i >= 0; i--) {
//            sb.append(s.charAt(i));
//        }
//        Integer outputInt = Integer.parseInt(sb.toString());
//        System.out.print(outputInt);

        int reverseNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println(reverseNum);


    }
}
