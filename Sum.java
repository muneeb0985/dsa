import java.util.Scanner;

public class Sum {
    public static int CalculateSum(int Mun) {
        if (Mun <= 1) {
            return Mun;
        }
        return Mun + CalculateSum(Mun - 1);
    }

    public static void main(String[] args) {
        Scanner mun = new Scanner(System.in);
        System.out.println("Enter a no");
        int munee = mun.nextInt();
        int muneeb = CalculateSum(munee);
        System.out.println("sum of first N no is " + muneeb);
    }
}
