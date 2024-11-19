public class Palindrome {
    public boolean ispalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return ispalindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Palindrome king = new Palindrome();
        String z = "eye";
        boolean reasult = king.ispalindrome(z);
        System.out.println(reasult);
    }
}
