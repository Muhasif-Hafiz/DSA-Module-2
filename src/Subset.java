import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {

        int[] nums = {3, 4, 5};
        List<List<Integer>> ans = subsets(nums);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }


    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list;
        list = new ArrayList<>();
        helper(result, list, nums, 0);
        return result;

    }

    public static void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int index) {

        if (index == nums.length) {

            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        helper(result, list, nums, index + 1);
        list.remove(list.size() - 1);
        helper(result, list, nums, index + 1);


    }
}
