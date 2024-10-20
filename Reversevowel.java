public class Reversevowel {
    public static String reversevowel(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (!isVowel(chars[i])) {
                i++;
            } else if (!isVowel(chars[j])) {
                j--;
            } else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return new String(chars); // Return the modified string
    }

    public static boolean isVowel(char ch) { // Corrected char parameter
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Reversevowel king = new Reversevowel();
        String k = "hello";
        String reasult = king.reversevowel(k);
        System.out.println(reasult);
    }
}