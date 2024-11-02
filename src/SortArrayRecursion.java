import java.util.Arrays;

public class SortArrayRecursion {
    public static void main(String[] args) {

        int [] arr={8,3,5,2,9,1,6};
        sortArray(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    public static  void sortArray(int [] arr, int first){

        if(first>=arr.length){
            return;
        }

        int minIndex=findMin(arr, first, arr.length);
        swap(arr, minIndex, first);

        sortArray(arr, first+1);

    }
    public static  void swap(int []arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static  int findMin(int [] arr, int first, int n){
        int i=first;
        int index=first;
        int smallest=Integer.MAX_VALUE;
        while(i<n){
            if(arr[i]<smallest){
                smallest=arr[i];
                index=i;

            }
            i++;
        }
        return index;
    }
}
