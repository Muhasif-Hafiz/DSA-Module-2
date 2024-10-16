import java.util.ArrayList;
import java.util.List;

public class PalindromePartition131 {
    public static void main(String[] args) {
        List<List<String>> ans=partition("aab");
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }
    public static List<List<String>> partition(String s) {
        List<List<String>> result= new ArrayList<>();
        solve(result,new ArrayList<>(),  s, 0);
        return result;
    }
    public static void solve(List<List<String>> result, ArrayList<String>list,String s, int index ){

        if(index>=s.length()){

            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=index;i<s.length();i++){

            if(isPalindrome(s,index,i)){
                list.add(s.substring(index,i+1));
                solve(result, list,s,index+1);
                list.remove(list.size()-1);
            }
        }

    }
    public static boolean isPalindrome(String s, int start, int end){

        while (start <= end) {

            if(s.charAt(start++)!=s.charAt(end--)) return false;
        }
        return true;
    }
}
