public class StringOperation {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "this ";
        String str3 = "is ";
        String str4 = "a Java ";
        String str5 = "program.";
        String concatenatedString = str1 + str2 + str3 + str4 + str5;
        System.out.println("Concatenated String: " + concatenatedString);
        String upperStr4 = str4.toUpperCase();
        System.out.println("Fourth string in uppercase: " + upperStr4);
        String substringFrom8 = concatenatedString.substring(8);
        System.out.println("Substring from index 8 onward: " + substringFrom8);

    }
}
