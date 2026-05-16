public class Palindrome {

    public static boolean isPalindrome(int x) {

        int reversed = 0;
        int og = x;

        if (x < 0) {
            return false;
        }

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        if (reversed == og) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int x = 121;

        boolean result = isPalindrome(x);

        System.out.println(result);
    }
}