import java.util.Scanner;

public class DecendingOrder {
    public static void DECENDINGORDER(int mun) {
        if (mun < 0) {
            return;
        }
        System.out.println("Decending order" + mun);
        DECENDINGORDER(mun - 1);
    }

    public static void main(String[] args) {
        DecendingOrder MUN = new DecendingOrder();
        Scanner muneeb = new Scanner(System.in);
        System.out.println("enter no");
        int mun = muneeb.nextInt();
        MUN.DECENDINGORDER(mun);
    }
}