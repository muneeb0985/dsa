import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int remain,
            int start) {
        if (remain == 0) {
            result.add(new ArrayList<>(tempList));
        } else if (remain > 0) {
            for (int i = start; i < nums.length; i++) {
                if (nums[i] == 0)
                    continue;
                tempList.add(nums[i]);
                backtrack(result, tempList, nums, remain - nums[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] muneeb = { 1, 3 };
        int munee = 1;
        List<List<Integer>> munib = combinationSum(muneeb, munee);
        System.out.println("Unique combinations that sum up to " + munee + ":");
        for (List<Integer> muniib : munib) {
            System.out.println(muniib);
        }
    }
}
