import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
//        int [] arr={3,1,2};
//        ArrayList<Integer> list=new ArrayList<>();
//        subsequence(0,list,arr,3);

//        System.out.println(removeCharacter(0,"",""));
 //       System.out.println(removeCharacter2("baccadh"));

      ArrayList<String> list=subseqRet("","abc");
        System.out.println(list);



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

    public static ArrayList<String> subseq(String p, String  up, ArrayList<String> list){

        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);

        subseq(p+ch, up.substring(1),list);
        subseq(p, up.substring(1), list);
        return list;
    }
    public static ArrayList<String> subseqRet(String p, String  up){

        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);

       ArrayList<String> left= subseqRet(p+ch, up.substring(1));
        ArrayList<String> right= subseqRet(p, up.substring(1));
      left.addAll(right);
      return left;
    }
}
