import java.util.ArrayList;

public class SubSequenceSum {
    public static void main(String[] args) {
        int [] nums= {1,2,1,1};
        int ans =sequenceSumCount(0,new ArrayList<Integer> (), nums, 0);
        System.out.println(ans);
    }
    public static boolean sequenceSum(int index, ArrayList<Integer> list, int [] nums, int sum){

   if(index== nums.length){

       if(sum==2){
           System.out.println(list);
           return true;
       }
       return false;
   }

        list.add(nums[index]);
        sum=sum+nums[index];
       if(sequenceSum(index+1, list, nums, sum)==true) return true;

        list.remove(list.size()-1);
        sum=sum-nums[index];
     if(sequenceSum(index+1, list, nums, sum)==true){
         return true;
     }
        return false;
    }
    public static int sequenceSumCount(int index, ArrayList<Integer> list, int [] nums, int sum){

        if(index== nums.length){
int localCount=0;
            if(sum==2){
               return 1;
            }
            return 0;
        }
int count=0;

        sum=sum+nums[index];
     count+= sequenceSumCount(index+1, list, nums, sum) ;


        sum=sum-nums[index];
     count+=   sequenceSumCount(index+1, list, nums, sum);


        return count;
    }
}
