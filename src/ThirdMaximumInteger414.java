import java.util.Arrays;

public class ThirdMaximumInteger414 {
    public static void main(String[] args) {
        int [] arr={1,1,2};
        System.out.println(thirdMax(arr));
    }
    public  static int thirdMax(int[] nums) {


        Arrays.sort(nums);

        if(nums.length<3){
            return nums[nums.length-1];
        }
        int count=0;
        int min=Integer.MAX_VALUE;

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
                count++;
            }
            if(count==3){
                break;
            }
        }
        if(count!=3){
            return nums[nums.length-1];
        }
        return min;

    }
}
