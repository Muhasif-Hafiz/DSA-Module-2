public class GenerateBinaryStringsGFG {
    public static void main(String[] args) {

        generate(4);
    }
    public static void generate (int k){
        int i=k;
        String s="";

        helper(k, s,i );
    }
    private static  void helper(int k, String s, int index){
        if(index==0){
            System.out.println(s);
            return;
        }
        s=s+"0";
        helper(k,s,index-1);
        s=s.substring(0, s.length()-1);
        if( s.isEmpty() ||  s.charAt(s.length()-1)!='1'){
            s=s+"1";
            helper(k,s,index-1);
        }else{
            return;
        }
    }
}
