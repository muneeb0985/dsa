import java.util.*;

public class pal {
    public static boolean isPALINDROME(String mun) {
        int muneb = 0;
        int muneeb = mun.length() - 1;
        while (muneb < muneeb) {
            if (mun.charAt(muneb) != mun.charAt(muneeb)) {
                return false;
            }
            muneb++;
            muneeb--;
        }
        return true;
    }

    public static void main(String[] args) {
        pal munb = new pal();
        String[] mune = { "muneeb", "mun", "muneb" };
        for (String munib : mune) {
            if (munb.isPALINDROME(munib)) {
                System.out.println(munib + " is a palindrome.");
            } else {
                System.out.println(munib + " is not a palindrome.");
            }
        }
    }
}
