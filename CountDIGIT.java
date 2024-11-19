public class CountDIGIT {
    public static int CountDIGIT(int mun) {
        if (mun == 0) {
            return 0;
        } else {
            return 1 + CountDIGIT(mun / 10);
        }
    }

    public static void main(String[] args) {
        int mune = 130;
        int muneeb = CountDIGIT(mune);
        System.out.println("Number of digits in " + mune + " is: " + muneeb);
    }
}
