package arrays;

public class ValidPalindrome {

    public static void main(String[] args) {
        String phrase = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(phrase));
    }

    static boolean validPalindrome(String phrase) {
        int left = 0;
        int right = phrase.length() - 1;
        char cLeft = phrase.charAt(left);
        char cRight = phrase.charAt(right);
        while (left < right) {
            if (!Character.isLetterOrDigit(cLeft)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(cRight)) {
                right--;
                continue;
            }
            if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

