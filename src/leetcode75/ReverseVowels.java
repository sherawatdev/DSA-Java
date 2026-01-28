package leetcode75;

    import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseVowels {

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
        System.out.println(reverseVowelsAdvance(s));
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

    public static String reverseVowelsAdvance(String s) {

        Set<Character> vowelsSet = new HashSet();
        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');
        vowelsSet.add('A');
        vowelsSet.add('E');
        vowelsSet.add('I');
        vowelsSet.add('O');
        vowelsSet.add('U');
        List<Integer> indexList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (vowelsSet.contains(s.charAt(i))) {
                sb.append(s.charAt(i));
                indexList.add(i);
            }
        }
        sb.reverse();
        int sbCount = 0;
        char[] charArr = s.toCharArray();
        for (int i = 0; i < indexList.size(); i++) {
            charArr[indexList.get(i)] = sb.charAt(sbCount++);
        }

        return new String(charArr);
    }
}
