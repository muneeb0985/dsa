public class EvenOddCount {
    public static void countEvenOdd(int[] muneeb) {
        int mun = 0;
        int munee = 0;
        for (int mune : muneeb) {
            if (mune % 2 == 0) {
                mun++;
            } else {
                munee++;
            }
        }
        System.out.println("Even numbers: " + mun);
        System.out.println("Odd numbers: " + munee);
    }

    public static void main(String[] args) {
        int[] muneeb = { 1, 3, 0 };
        countEvenOdd(muneeb);
    }
}
