public class SubsequenceSumK {
    public static void main(String[] args) {

        int [] arr={-5,3,0};
        System.out.println(isSubsetPresent(3,-2,arr));
    }
    public static boolean isSubsetPresent(int n, int k,int []a) {

        boolean ans= helper(n,k,a, 0,0);
        return ans;
    }
    private static boolean helper(int n, int k, int [] arr , int index , int sum){

        if(index>=n && sum != k){
            return false;
        }
        if(sum==k){
            return true;
        }
        sum +=arr[index];
       boolean ans1= helper(n, k, arr, index+1, sum);
        sum-=arr[index];
       boolean ans2= helper(n,k,arr,index+1 , sum);
       return ans1 || ans2;
    }
}


