package leetcode75;

public class GcdOfStrings {

    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int a = str1.length();
        int b = str2.length();

        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return str1.substring(0, a);
    }
}
