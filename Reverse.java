import java.util.Scanner;

public class Reverse {
    public static void Reversing(String mun, int mune) {
        if (mune < 0) {
            return;
        }
        System.out.print(mun.charAt(mune));
        Reversing(mun, mune - 1);
    }

    public static void main(String[] args) {
        Scanner munee = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        String muneeb = munee.nextLine();
        Reversing(muneeb, muneeb.length() - 1);
    }
}
