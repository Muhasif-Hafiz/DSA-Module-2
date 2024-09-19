public class CountGoodNumbers1922 {
    private static final int MOD = 1000000007;
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(5));
    }

    public static int countGoodNumbers(long n) {

        long even=(n+1)/2;
        long odd=n/2;

        long evenChoices=power(5, even, MOD);
        long oddChoices=power(4, odd, MOD);

        return (int)(evenChoices * oddChoices % MOD);
    }
    private static long power(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if(exp%2==1){
                result=result*base%mod;
            }
            base =base*base%mod;
            exp/=2;
        }
        return result;
    }
}
