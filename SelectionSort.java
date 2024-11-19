import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int[] muneeb = { 1, 3, 0 };
        for (int i = 0; i < muneeb.length; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < muneeb.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < muneeb.length; j++) {
                if (muneeb[j] < muneeb[min]) {
                    min = j;
                }
            }
            int temp = muneeb[min];
            muneeb[min] = muneeb[i];
            muneeb[i] = temp;
            for (int k : muneeb) {
                System.out.println(k);
            }
        }
    }
}
