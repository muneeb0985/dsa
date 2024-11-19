import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Mango");
        stringList.add("GRAPES");
        System.out.println("Elements in the ArrayList:");
        for (String str : stringList) {
            System.out.println(" PRINTING ELEMENT " + str);
        }
        String largestString = Collections.max(stringList);
        System.out.println("The largest string is: " + largestString);
    }
}
