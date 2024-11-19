import java.util.Arrays;

public class ArrayMerger {
    private int[] array;

    public ArrayMerger(int[] array) {
        this.array = array;
    }

    public void mergeArray(int[] newArray) {
        int[] mergedArray = new int[this.array.length + newArray.length];
        System.arraycopy(this.array, 0, mergedArray, 0, this.array.length);
        System.arraycopy(newArray, 0, mergedArray, this.array.length, newArray.length);
        this.array = mergedArray;
    }

    public void displayArray() {
        System.out.println(Arrays.toString(this.array));
    }

    public static void main(String[] args) {
        int[] muneeb = { 1, 2, 3 };
        ArrayMerger munib = new ArrayMerger(muneeb);
        System.out.println("Original Array: ");
        munib.displayArray();
        int[] newArray = { 1, 3, 0 };
        munib.mergeArray(newArray);
        System.out.println("Merged Array: ");
        munib.displayArray();
    }
}
