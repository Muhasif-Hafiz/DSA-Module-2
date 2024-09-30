import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
//        int [] arr={3,1,2};
//        ArrayList<Integer> list=new ArrayList<>();
//        subsequence(0,list,arr,3);

//        System.out.println(removeCharacter(0,"",""));
        System.out.println(removeCharacter2("baccadh"));
    }
    public static void  subsequence(int ind, ArrayList<Integer> list, int [] arr, int n){
        if(ind==n){
            System.out.print(list);
            System.out.print(" ");
            return;
        }
        list.add(arr[ind]);
        subsequence(ind+1,list, arr, n);
        list.remove(list.size()-1);
        subsequence(ind+1, list, arr, n);
    }

    public static String removeCharacter(int index, String up, String p){
        if(index==p.length())
        {
            return  up;
        }
        if(p.charAt(index)!='a'){
                    up+=p.charAt(index);
        }
        return removeCharacter(index+1, up, p);

    }
    static String removeCharacter2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            return removeCharacter2(up.substring(1));
        }else{
            return ch + removeCharacter2(up.substring(1));
        }
    }
}
