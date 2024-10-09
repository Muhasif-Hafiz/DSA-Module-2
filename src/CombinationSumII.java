import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr={10,1,6,3,6,3,8,6,3,1};
        List<List<Integer>> list= combinationSum2(arr, 8);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, candidates,target, result, new ArrayList<>());
        return result;
    }
    public static void helper(int index, int [] arr, int target, List<List<Integer>> result, List<Integer> list){

        if(target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<arr.length;i++){

            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            list.add(arr[i]);
            helper(i+1, arr, target-arr[i], result, list );
            list.remove(list.size()-1);
        }
    }
}
