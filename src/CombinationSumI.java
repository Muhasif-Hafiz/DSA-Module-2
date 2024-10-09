import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CombinationSumI {
    HashSet<List<List<Integer>>> set = new HashSet<>();
    public static void main(String[] args) {
        int [] arr={10,1,2,7,6,1,5};

        List<List<Integer>> ans=combinationSum(arr, 8);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result= new ArrayList<>();
        List<Integer> list= new ArrayList<>() ;

        return helper(candidates, result, list, target, 0,0);

    }
    public static List<List<Integer>> helper(int [] arr, List<List<Integer>> result, List<Integer> list, int target, int index, int sum){

        if(sum==target){
            List<Integer> newList= new ArrayList<>(list);


            result.add(newList);
            return result;

        }
        if(sum>target || index>=arr.length){
            return result;
        }
        int num=arr[index];
        list.add(num);
        sum=sum+num;
        helper(arr, result, list, target,index+1, sum);
        sum=sum-num;
        list.remove(list.size()-1);
        return helper(arr,result,list ,target, index+1, sum);
    }
}
