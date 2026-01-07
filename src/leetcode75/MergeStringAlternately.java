package leetcode75;

public class MergeStringAlternately {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternatelyAdvance("ab", "pqrs"));
    }

    private static String mergeAlternatelyAdvance(String word1, String word2) {
        if (word1 == null) word1 = "";
        if (word2 == null) word2 = "";

        final int n1 = word1.length();
        final int n2 = word2.length();
        StringBuilder sb = new StringBuilder(n1 + n2);

        int i = 0;
        while (i < n1 || i < n2) {
            if (i < n1) sb.append(word1.charAt(i));
            if (i < n2) sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public static String mergeAlternately(String word1, String word2) {

        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();
        int length = word1.length() + word2.length();
        char[] opStrArr = new char[length];
        int maxLength = word2.length();
        if (word1.length() > word2.length()) {
            maxLength = word1.length();
        }
        int j = 0;
        for (int i = 0; i< maxLength; i++) {
            if (i<word1.length()) {
                opStrArr[j++] = word1Arr[i];
            }
            if (i<word2.length()) {
                opStrArr[j++] = word2Arr[i];
            }
        }
        return new String(opStrArr);
    }
}
