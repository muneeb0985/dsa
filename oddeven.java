public class oddeven {
    public static void countevenodd(int number) {
        int evencount = 0;
        int oddcount = 0;
        number = Math.abs(number);
        while (number > 0) {
            int k = number % 10;
            if (number % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
            number /= 10;
        }
    }

    public static void main(String[] args) {
        int number = 123456789;
        countevenodd(number);
    }
}
