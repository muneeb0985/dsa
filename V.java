
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class V {
    public static void main(String[] args) {
        Vector<Integer> king = new Vector<Integer>();
        king.add(1);
        king.add(2);
        king.add(3);
        king.add(4);
        king.add(5);
        int max = king.get(0);
        int min = king.get(0);
        for (int i = 0; i < king.size(); i++) {
            if (king.get(i) > max) {
                max = king.get(i);
            }
        }
        System.out.println(king);
        System.out.println(" max is " + max);
        for (int i = 1; i < king.size(); i++) {
            if (king.get(i) < min) {
                min = king.get(i);
            }
        }
        System.out.println(" min is " + min);
        Collections.sort(king);
        System.out.println("sorted" + king);
    }
}
