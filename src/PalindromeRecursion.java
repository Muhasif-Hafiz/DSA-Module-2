public class PalindromeRecursion {
    public static void main(String[] args) {
        System.out.println(isPalindrome("11211",0));
    }
    public static boolean isPalindrome(String str, int i){

        if(i>=str.length()/2) {
            return true;
        }
        return  isSame(str.charAt(i), str.charAt(str.length()-i-1)) && isPalindrome(str,i+1);


    }
    public static boolean isSame(char a , char b){

        return a==b;
    }
}
