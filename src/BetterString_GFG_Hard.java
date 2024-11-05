import java.util.HashSet;

public class BetterString_GFG_Hard {
    public static void main(String[] args) {

        String ans=betterString("wvpwo","nypsv");
        System.out.println(ans);
    }
    public static String betterString(String str1, String str2) {

        HashSet<String> set1= new HashSet<>();
        HashSet<String> set2= new HashSet<>();
        int a=countSubsequences( str1, "", set1, 0);
        int b= countSubsequences( str2,"", set2,0);

        return (b > a) ? str2 : str1;
    }
    private static int countSubsequences(String str, String ans, HashSet<String> set, int index ){

        if(index>=str.length()){
             if (set.add(ans)){
                 return 1;
             }
             return 0;
        }

        int left= countSubsequences(str, ans+str.charAt(index),set,index+1);
        int right=countSubsequences(str,ans, set, index+1);
        return left+right;
    }
}
