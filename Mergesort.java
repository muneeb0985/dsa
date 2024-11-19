import java.util.Arrays;
import java.util.Random;

public class Mergesort {
    public static void mergesort(int[] muneeb, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergesort(muneeb, left, mid);
            mergesort(muneeb, mid + 1, right);
            merge(muneeb, left, mid, right);
            System.out.println("iterating element " + Arrays.toString(muneeb));
        }
    }

    public static void merge(int[] muneeb, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] mun = new int[n1];
        int[] munib = new int[n2];

        for (int i = 0; i < n1; i++) {
            mun[i] = muneeb[left + i];
        }
        for (int j = 0; j < n2; j++) {
            munib[j] = muneeb[mid + 1 + j];
        }

        int z = 0, j = 0, k = left;
        while (z < n1 && j < n2) {
            if (mun[z] <= munib[j]) {
                muneeb[k] = mun[z];
                z++;
            } else {
                muneeb[k] = munib[j];
                j++;
            }
            k++;
        }

        while (z < n1) {
            muneeb[k] = mun[z];
            z++;
            k++;
        }

        while (j < n2) {
            muneeb[k] = munib[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] muneeb = new Random().ints(10, 1, 100).toArray();
        mergesort(muneeb, 0, muneeb.length - 1);
        System.out.println("merge sort" + Arrays.toString(muneeb));
    }
}
