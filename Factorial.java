public class Factorial {
    public static int CalculateFactorial(int mun) {
        if (mun == 0 || mun == 1) {
            return 1;
        } else {

            return mun * CalculateFactorial(mun - 1);
        }
    }

    public static void main(String[] args) {
        int mune = 130;
        int muneeb = CalculateFactorial(mune);
        System.out.println("Factorial of " + mune + " is: " + muneeb);
    }
}
