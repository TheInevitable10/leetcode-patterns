public class ValidPalindrome{
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char first = s.charAt(left);
            char last = s.charAt(right);

            if (!Character.isLetterOrDigit(first)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(last)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "Malayalam";
        System.out.println(isPalindrome(s));
    }
}