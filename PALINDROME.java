import java.util.*;

public class PALINDROME {
    public static boolean isPalindrome(String mun, int mune, int muneb) {
        if (mune >= muneb) {
            return true;
        }
        if (mun.charAt(mune) != mun.charAt(muneb)) {
            return false;
        }
        return isPalindrome(mun, mune + 1, muneb - 1);
    }

    public static void main(String[] args) {
        Scanner muneeb = new Scanner(System.in);
        System.out.println("Enter string:");
        String Mune = muneeb.nextLine();
        if (isPalindrome(Mune, 0, Mune.length() - 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
