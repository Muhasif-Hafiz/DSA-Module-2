import java.util.Arrays;

public class ArrayReversalRecursion {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
    public static int [] reverseArray(int [] arr){

        return reversed(arr, 0,arr.length-1);
    }
    public static int [] reversed(int [] arr, int i, int n){
        if(i>=n){
            return arr;
        }
        swap(arr, i, n);
        reversed(arr, i+1, n-1);

        return arr;


    }
  static   void swap(int [] arr, int a , int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
