import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> king = new Vector<Integer>();
        king.add(3);
        king.add(2);
        king.add(4);
        king.add(8);
        king.add(5);
        king.add(6);
        king.add(7);
        king.add(11);
        king.add(9);
        king.add(10);

        System.out.println("Before sum of integers: " + king);
        int sum = 0;
        for (int i : king) {
            sum += i;
        }
        System.out.println("After sum: " + sum);
        int max = king.get(0);
        for (int i = 1; i < king.size(); i++) {
            if (king.get(i) > max) {
                max = king.get(i);
            }
        }
        System.out.println("Maximum element in the Vector: " + max);
    }
}
