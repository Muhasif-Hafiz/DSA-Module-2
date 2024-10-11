import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubSet90 {
    public static void main(String[] args) {
        int [] nums={4,4,4,1,4};
  //      Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        ans=subsetsWithDup(nums);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        HashSet<List<Integer>> resultSet= new HashSet<>();
        List<Integer> list= new ArrayList<>();
        helper(resultSet, list, nums, 0,0);
        List<List<Integer>> ans= new ArrayList<>(resultSet);
        return ans;
    }
    public static void helper(HashSet<List<Integer>> set, List<Integer> list, int [] arr, int sum, int index){
        if(index>=arr.length){
            ArrayList<Integer> newList= new ArrayList<>(list);

            set.add(newList);
            return;
        }
        int num=arr[index];
        list.add(num);
        helper(set, list, arr, sum+num, index+1);
        list.remove(list.size()-1);
        helper(set, list,arr, sum-num, index+1);
    }
//optimised solution T.C 0(2^N * N)
    public void helper2(List<List<Integer>> result1, List<Integer> list, int [] nums, int index){

        result1.add(new ArrayList<>(list));

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            helper2(result1, list, nums, i+1);
            list.remove(list.size()-1);
        }
    }

}

// [[],[1],[1,4],[1,4,4],[1,4,4,4],[1,4,4,4,4],[4],[4,4],[4,4,4],[4,4,4,4]]
