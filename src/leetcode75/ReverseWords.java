package leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWordsAdvance("the sky is blue"));
    }

    public static String reverseWords(String s) {
        List<StringBuilder> sbList = new ArrayList();
        boolean extraSpaceExists = false;
        s.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                extraSpaceExists = false;
                sb.append(s.charAt(i));
                if (i == s.length() - 1) {
                    sbList.add(sb);
                    break;
                }
            } else if (s.charAt(i) == ' ') {
                if (extraSpaceExists) {
                    continue;
                }
                extraSpaceExists = true;
                sbList.add(sb);
                sb = new StringBuilder();
            }
        }
        StringBuilder opSb = new StringBuilder();
        for (int i = sbList.size() - 1; i > -1; i--) {
            opSb.append(sbList.get(i) + " ");
        }
        return opSb.toString();
    }

    public static String reverseWordsAdvance(String s) {
        String[] sArr = s.trim().split("\\s+");
        List<String> sList = Arrays.asList(sArr);
        StringBuilder sb = new StringBuilder();
        for (int i = sList.size() -1; i >= 0; i--) {
            sb.append(sList.get(i) + ' ');
        }
        return sb.toString().trim();
    }
}
