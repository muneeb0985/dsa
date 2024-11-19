public class SUMOFARRAY {
    public static int CalculateSum(int[] array, int mun) {
        if (mun < 0) {
            return 0;
        }
        return array[mun] + CalculateSum(array, mun - 1);
    }

    public static void main(String[] args) {
        int[] muneeb = { 1, 3, 0 };
        int munee = CalculateSum(muneeb, muneeb.length - 1);
        System.out.println("The sum of array is: " + munee);
    }
}
