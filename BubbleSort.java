public class BubbleSort {
    public static void main(String[] args) {
        int[] muneeb = { 1, 3, 0 };
        for (int i = 0; i < muneeb.length; i++) {
            System.out.print(muneeb[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < muneeb.length - 1; i++) {
            for (int j = 0; j < muneeb.length - 1 - i; j++) {
                if (muneeb[j] > muneeb[j + 1]) {
                    int temp = muneeb[j];
                    muneeb[j] = muneeb[j + 1];
                    muneeb[j + 1] = temp;
                }
            }
        }
        for (int i : muneeb) {
            System.out.println("After sort");
            System.out.println("" + i);
        }
    }
}
