import java.util.ArrayList;
import java.util.Arrays;

public class MERGE {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        ArrayList<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println("Merged ArrayList: " + mergedList);
    }
}
