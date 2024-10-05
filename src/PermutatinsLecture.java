import java.util.ArrayList;

public class PermutatinsLecture {
    public static void main(String[] args) {
//      ArrayList<String> list= permutations1("","abc");
//        System.out.println(list);
        int ans=permutationsCount("","abcdef");
        System.out.println(ans);

    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f= p.substring(0,i);
            String s= p.substring(i, p.length());
            permutations(f+ch+s, up.substring(1));
        }
    }
    static ArrayList<String> permutations1(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i <= p.length(); i++) {
            String prefix = p.substring(0, i);
            String suffix = p.substring(i);
            result.addAll(permutations1(prefix + ch + suffix, up.substring(1)));
        }

        return result;
    }
    static int permutationsCount(String p, String up){

        if(up.isEmpty()){
            return 1;
        }
        char ch= up.charAt(0);
        int FinalCount=0;
        for(int i = 0; i <= p.length(); i++) {
            String prefix = p.substring(0, i);
            String suffix = p.substring(i);
           FinalCount+=(permutationsCount(prefix + ch + suffix, up.substring(1)));
        }

        return FinalCount;
    }
}
