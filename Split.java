public class Split {
    public static void splitArray(int[] muneeb, int key) {
        int index = -1;
        for (int i = 0; i < muneeb.length; i++) {
            if (muneeb[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int[] mun = new int[index];
            int[] mune = new int[muneeb.length - index - 1];

            if (index > 0) {
                System.arraycopy(muneeb, 0, mun, 0, index);
            }
            System.arraycopy(muneeb, index + 1, mune, 0, muneeb.length - index - 1);

            for (int munee : mun) {
                System.out.print(munee + " ");
            }
            System.out.println();
            for (int munib : mune) {
                System.out.print(munib + " ");
            }
            System.out.println();
        } else {
            System.out.println("Key not found.");
        }
    }

    public static void main(String[] args) {
        int[] muneeb = { 1, 3, 0, 1, 2, 3 };
        int sum = 0;

        for (int i = 0; i < muneeb.length; i++) {
            sum += muneeb[i];
        }
        int key = 1;
        splitArray(muneeb, key);
    }
}
