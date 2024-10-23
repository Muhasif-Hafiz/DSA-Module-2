import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String[] args) {


        List<String> list= new ArrayList<>();
        list= generateParenthesis(2);
        System.out.println(list);
    }
    public static List<String> generateParenthesis(int n) {

        List<String> ans= new ArrayList<>();
        helper(ans, "", 0,0,n);
        return ans;
    }
    public static  void helper(List<String> list, String s, int open, int close, int n){
        if(s.length()==n*2){
            list.add(s);
            return;
        }
        if(open<n){
            helper(list, s+"(", open+1, close, n);
        }
        if(close<open){
            helper(list, s+")", open, close+1, n);
        }
    }
}
