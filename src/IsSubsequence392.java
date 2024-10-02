public class IsSubsequence392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahfbdec"));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0 ){
            return true;
        }
        if(t.length()==0){
            return false;
        }

        int j = 0;
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
            if(j == s.length()){
                return true;
            }
        }
        return j==s.length();
    }
}
