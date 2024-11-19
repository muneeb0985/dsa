import java.util.Scanner;

public class Real {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] muneeb = new double[7];
        double sum = 0;
        System.out.println("Enter 7 real numbers:");

        for (int i = 0; i < muneeb.length; i++) {
            muneeb[i] = scanner.nextDouble();
            sum += muneeb[i];
        }
        double muneb = sum / muneeb.length;
        System.out.println("Sum of elements: " + sum);
        System.out.println("Mean of elements: " + muneb);
    }
}