public class oddeven {
    public static void countevenodd(int number) {
        number = Math.abs(number);
        int evencount = 0;
        int oddcount = 0;
        while (number > 0) {
            Integer king = number % 10;
            if (king % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
            number /= 10;
        }
        System.out.println("Even digits count: " + evencount);
        System.out.println("Odd digits count: " + oddcount);
    }

    public static void main(String[] args) {
        int number = 123456789;
        countevenodd(number);
    }
}
