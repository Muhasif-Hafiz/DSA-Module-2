import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class permutationsII47 {
    public static void main(String[] args) {
        List<List<Integer>> result= permuteUnique(new int []{1,2,3});
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result= new ArrayList<>();
        if(nums.length==0){
            return result;
        }
        Arrays.sort(nums);
        boolean [] used= new boolean[nums.length];
        backtrack(result,new ArrayList<>(), used, nums);
        return result;
    }
    public static void backtrack(List<List<Integer>> result, List<Integer> tempList, boolean [] used, int [] nums){

        if(tempList.size()==nums.length){

            result.add(new ArrayList<Integer>(tempList));
            return ;
        }

        for(int i=0;i<nums.length;i++){

            if(used[i]) continue;

            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;

            used[i]=true;
            tempList.add(nums[i]);
            backtrack(result, tempList, used, nums);
            used[i]=false;
            tempList.remove(tempList.size()-1);

        }

    }
}
