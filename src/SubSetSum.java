import java.util.ArrayList;

public class SubSetSum {
    public static void main(String[] args) {
        ArrayList<Integer> result=new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(1);
        ArrayList<Integer> list= new ArrayList<>();
        list=subsetSums(result,result.size());
        System.out.println(list);


    }
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {

        ArrayList<Integer> result= new ArrayList<>();

        helper(result, arr, n, 0,0);
        return result;
    }
    public static void helper( ArrayList<Integer> result,  ArrayList<Integer> arr, int n, int index, int sum){


        if(index>=n){
            result.add(sum);
            return;
        }
        int num=arr.get(index);

        sum=sum+num;
        helper(result,arr,n,index+1, sum);
        sum=sum-num;
        helper(result, arr, n,index+1, sum);
    }
}
