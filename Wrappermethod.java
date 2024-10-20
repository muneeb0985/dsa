public class Wrappermethod {
    public static void main(String[] args) {
        int o = 1;
        Integer k = o;
        Integer z = Integer.parseInt("10");
        Integer P = Integer.MAX_VALUE;
        Integer t = Integer.MIN_VALUE;
        System.out.println("parseInt:" + z);
        System.out.println("Max Value:" + P);
        System.out.println("Min Value:" + t);

        float w = 2.5f;
        Float i = w;
        Float j = Float.parseFloat("1");
        Float h = Float.MAX_VALUE;
        Float R = Float.MIN_VALUE;
        System.out.println(w);
        System.out.println("parseFloat:" + j);
        System.out.println("Max Value:" + h);
        System.out.println("Min_value:" + R);

        double sad = 12.5d;
        Double king = sad;
        Double hen = Double.MAX_VALUE;
        Double ben = Double.MIN_VALUE;
        Double year = Double.parseDouble("13");
        System.out.println(sad);
        System.out.println("MaxValue:" + king);
        System.out.println("MinValue:" + ben);
        System.out.println("parse:" + year);
    }

}
