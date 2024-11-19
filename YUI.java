import java.util.*;

public class YUI {
    public static void main(String[] args) {
        ArrayList<String> io = new ArrayList<String>(); // Creates an ArrayList to store String elements
        io.add("Lion");
        io.add("jungle");
        io.add("apple");
        // Display each element in the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (String element : io) {
            System.out.println(element);
        }
    }
}
