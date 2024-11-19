import java.util.Scanner;

public class HashCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to get its hash code (type 'exit' to quit):");
        String input = scanner.nextLine();
        int hashCode = input.hashCode();
        System.out.println("Hash code of \"" + input + "\" is: " + hashCode);
    }
}
