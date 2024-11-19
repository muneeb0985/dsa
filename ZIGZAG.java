import java.util.Arrays;

public class ZIGZAG {

    public static void zigzag(int[] muneeb) {
        for (int i = 0; i < muneeb.length - 1; i++) {
            if (i % 2 == 0) {
                if (muneeb[i] > muneeb[i + 1]) {
                    int temp = muneeb[i];
                    muneeb[i] = muneeb[i + 1];
                    muneeb[i + 1] = temp;
                }
            } else {
                if (muneeb[i] < muneeb[i + 1]) {
                    int temp = muneeb[i];
                    muneeb[i] = muneeb[i + 1];
                    muneeb[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] muneeb = { 2, 3, 4 };
        zigzag(muneeb);
        System.out.println("Zigzag array: " + Arrays.toString(muneeb));
    }
}
