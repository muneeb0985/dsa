import java.util.ArrayList;

public class Merge {
    private static ArrayList<Integer> muneeb = new ArrayList<Integer>();

    public static int[] mergeAndRemoveDuplicates(int[] array1, int[] array2) {
        for (int mun : array1) {
            if (!muneeb.contains(mun)) {
                muneeb.add(mun);
            }
        }

        for (int mun : array2) {
            if (!muneeb.contains(mun)) {
                muneeb.add(mun);
            }
        }

        int[] mune = new int[muneeb.size()];
        for (int i = 0; i < muneeb.size(); i++) {
            mune[i] = muneeb.get(i);
        }

        return mune;
    }

    public static int[] mergeWithExistingArray(int[] newArray) {
        for (int mun : newArray) {
            if (!muneeb.contains(mun)) {
                muneeb.add(mun);
            }
        }
        int[] mergedArray = new int[muneeb.size()];
        for (int i = 0; i < muneeb.size(); i++) {
            mergedArray[i] = muneeb.get(i);
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] muneeb1 = { 1, 3, 0 };
        int[] muneeb2 = { 1, 4, 5 };
        int[] muneeb12 = mergeAndRemoveDuplicates(muneeb1, muneeb2);
        System.out.print("Merged array without duplicates: ");
        for (int muneeb : muneeb12) {
            System.out.print(muneeb + " ");
        }
        System.out.println();
        int[] muneeb = { 6, 7, 8 };
        int[] muneeb130 = mergeWithExistingArray(muneeb);
        System.out.print("Array after merging with new array: ");
        for (int munee : muneeb130) {
            System.out.print(munee + " ");
        }
    }
}
