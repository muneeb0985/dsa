import java.util.*;
import java.util.Scanner;

public class Small {
    public static void main(String[] args) {
        ArrayList<Integer> king = new ArrayList<Integer>();
        king.add(1);
        king.add(2);
        king.add(3);
        king.add(4);
        king.add(5);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of k to find the k-th smallest element: ");
        int k = scanner.nextInt();
        if (k > 0 && k <= king.size()) {
            int kthSmallest = king.get(k - 1);
            System.out.println("The " + k + "-th smallest element is: " + kthSmallest);
        } else {
            System.out.println("Invalid value of k. Please enter a value between 1 and " + king.size());
        }
    }
}