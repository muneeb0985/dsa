import java.util.*;

public class GenericMergeSort {
    public static <T extends Comparable<T>> void mergeSort(List<T> list) {
        if (list.size() < 2)
            return;
        int mid = list.size() / 2;
        List<T> left = new ArrayList<>(list.subList(0, mid));
        List<T> right = new ArrayList<>(list.subList(mid, list.size()));
        mergeSort(left);
        mergeSort(right);
        merge(list, left, right);
    }

    public static <T extends Comparable<T>> void merge(List<T> list, List<T> left, List<T> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        while (i < left.size())
            list.set(k++, left.get(i++));
        while (j < right.size())
            list.set(k++, right.get(j++));
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 3, 8, 6, 2, 7, 4, 1);
        mergeSort(integers);
        System.out.println(integers);

        List<String> strings = Arrays.asList("muneeb", "secB", "batch2023F", "RollNo130");
        mergeSort(strings);
        System.out.println(strings);
    }
}
