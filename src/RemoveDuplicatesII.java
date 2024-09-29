public class RemoveDuplicatesII {
    public static void main(String[] args) {
int [] arr={0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }

       int j=1;
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
        }
return j;
    }
}
