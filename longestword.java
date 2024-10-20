import java.util.Scanner;

public class longestword {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Hello");
        String str4 = new String("World");
        String str5 = str3.intern();
        String str6 = str4.intern();
        String modifiedStr1 = str1.concat(" Java");
        System.out.println(" string 1 " + str1);
        System.out.println(" string 2 " + str2);
        System.out.println(" string 3 " + str3);
        System.out.println(" string 4 " + str4);
        System.out.println(" string 5 " + str5);
        System.out.println(" string 6 " + str6);
        System.out.println("modified string 1" + modifiedStr1);
    }
}
