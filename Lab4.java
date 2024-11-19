public class Lab4 {
    public static void main(String[] args) {
        int[] muneeb = { 1, 2, 3, 4 };
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
        }
        int temp = muneeb[0];
        muneeb[0] = muneeb[3];
        muneeb[3] = temp;
        temp = muneeb[1];
        muneeb[1] = muneeb[2];
        muneeb[2] = temp;
        System.out.println("after swap");
        for (int mun : muneeb) {
            System.out.println(mun);
        }
    }
}
