import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class Permutations46_LeetCode {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] nums = {1, 2, 3};

        // Generate permutations
        result = permutationsLeetcode(nums, list, 0);

        // Print each permutation
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }

    public static List<List<Integer>> permutationsLeetcode(int[] nums, List<Integer> list, int index) {

        if (index >= nums.length) {
            List<List<Integer>> baseResult = new ArrayList<>();
            baseResult.add(new ArrayList<>(list));
            return baseResult;
        }

        List<List<Integer>> result = new ArrayList<>();
        int num = nums[index];


        for (int i = 0; i <= list.size(); i++) {
            list.add(i, num);


            result.addAll(permutationsLeetcode(nums, list, index + 1));


            list.remove(i);
        }

        return result;
    }
    //    public static List<List<Integer>> permute(int [] nums) {
//        List<List<Integer>> result= new ArrayList<>();
//        result= permutationsLeetcode(new List<List<Integer>>(),new List<Integer>(), nums,0);
//        return result;
//
//
//
//    }
}
