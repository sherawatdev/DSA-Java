package leetcode75;

import java.util.HashMap;

public class ReverseVowels {

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {

        String a = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (a.contains(String.valueOf(s.charAt(i)))) {
                sb.append(s.charAt(i));
            }
        }
        sb.reverse();
        int sbCount = 0;
        StringBuilder sbOp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (a.contains(String.valueOf(s.charAt(i)))) {
                sbOp.append(sb.charAt(sbCount++));
            } else {
                sbOp.append(s.charAt(i));
            }

        }
        return sbOp.toString();
    }
}
