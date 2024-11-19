public class MissingNumber {
    public static int FindmissingNumber(int[] muneeb) {
        int mun = muneeb.length;
        int mu = mun * (mun + 1) / 2;
        int muneb = 0;
        for (int munib : muneeb) {
            muneb += munib;
        }
        return mu - muneb;
    }

    public static void main(String[] args) {
        MissingNumber munee = new MissingNumber();
        int[] muneeb = { 1, 3, 0 };
        int muniib = munee.FindmissingNumber(muneeb);
        System.out.println("missing no are" + ":" + muniib);
    }
}
