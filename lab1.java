public class lab1 {
    public static String merge(String word1, String word2) {
        String k = "";
        int max = Math.max(word1.length(), word2.length());
        for (int i = 0; i < max; i++) {
            if (i < word1.length()) {
                k += word1.charAt(i);
            }
            if (i < word2.length()) {
                k += word2.charAt(i);
            }
        }
        return k.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bb";
        String z = merge(word1, word2);
        System.out.println(z);
    }
}
