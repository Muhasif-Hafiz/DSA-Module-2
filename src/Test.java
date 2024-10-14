import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int [] nums={1,2,3};
        List<List<Integer>> ans=permute(nums);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result= new ArrayList<>();
        permutations(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
    public static void permutations(List<List<Integer>> result,List<Integer> list, int [] arr, int index){

        if(index>=arr.length){
            result.add(new ArrayList<>(list));
            return;
        }
        int num=arr[index];
        for(int i=0;i<=list.size();i++){

            list.add(i, num);
            permutations(result, list, arr, index+1);
            list.remove(i);
        }

    }
}
