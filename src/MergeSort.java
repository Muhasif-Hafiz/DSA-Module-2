import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr={3,2,6,0,1,4,9};
       mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void mergeSort(int [] arr, int start, int end){

         if(start>=end){
             return  ;
         }
         int mid=start+(end-start)/2;

         mergeSort(arr, start,mid);
         mergeSort(arr,mid+1, end);

           merge(arr, start, mid, end);
    }
    public static void merge(int [] arr, int start, int mid, int end){

        int left= start;
        int right= mid+1;
        ArrayList<Integer> list= new ArrayList<>();
        while(left<=mid && right<=end){

            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=end){
            list.add(arr[right]);
            right++;
        }
        for(int i =start;i<=end;i++){
            arr[i]=list.get(i-start);
        }

    }
}

