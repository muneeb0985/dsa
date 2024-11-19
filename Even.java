public class Even {
    public static int[] even(int[] k) { // Corrected return type to int[]
        int odd = 0;
        for (int i = 0; i < k.length; i++) {
            if (k[i] % 2 != 0) {
                odd++;
            }
        }

        int[] reasult = new int[odd];
        int z = 0;
        for (int i = 0; i < k.length; i++) {
            if (k[i] % 2 != 0) {
                reasult[z] = k[i];
                z++;
            }
        }
        return reasult; // Return correct array
    }

    public static void main(String[] args) {
        int[] k = { 3, 2, 4, 7 };
        Even o = new Even();
        int[] evens = o.even(k); // Store the result in evens array
        for (int num : evens) {
            System.out.print(num + " ");
        }
    }
}
