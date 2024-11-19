import java.util.*;

public class GREATESTCOMMON {
    public static int gcd(int mun, int muneb) {
        if (muneb == 0) {
            return muneb;
        }
        return gcd(muneb, mun % muneb);
    }

    public static void main(String[] args) {
        Scanner muneeb = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int munb = muneeb.nextInt();
        int munee = muneeb.nextInt();
        System.out.println("GCD: " + gcd(munb, munee));
    }
}
