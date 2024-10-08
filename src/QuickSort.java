import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {


         int [] arr={7,5,31,8,74,4,2,0,1};
       quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int [] arr, int low, int high){

        if(low<high)
        {
          int partitionIndex= findIndex(arr, low, high);
          quickSort(arr, low, partitionIndex-1);
          quickSort(arr, partitionIndex+1, high);
        }
    }
    public static int  findIndex(int [] arr, int low, int high){

        int i=low;
        int j=high;
        int pivot=arr[low];

        while(i<j){

            while(pivot>=arr[i] && i<high){
                i++;
            }
            while(pivot<arr[j] && j>low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;

    }
}
