public class EVOD {
    public static void main(String[] args) {
        int[] mun = { 1, 3, 0 };
        int munib = 0;
        int muneeb = 0;
        for (int mu : mun) {
            if (mu % 2 == 0) {
                munib++;
            } else {
                muneeb++;
            }
        }
        System.out.println("even count" + munib);
        System.out.println("odd count " + muneeb);
    }
}
