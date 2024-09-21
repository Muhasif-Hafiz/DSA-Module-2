public class RecursionRevision {
    public static void main(String[] args) {
//        printNumbers(5);
//        printNames(6);
//        backtrack(1,5);
int ans=factorial(5);
        System.out.println(ans);
    }
    public static void printNumbers(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);

    }
    public static  void printNames(int n){
        if(n==0) return;
        System.out.println("Muhasib");
        printNames(n-1);

    }
    public static  void backtrack(int i, int n){
        if(i>n)return;
        backtrack(i+1,n);
        System.out.println(i);
    }
    public static  int sumOfAllNumbers(int n){

        if(n==0) return 0;
        int sum=n+sumOfAllNumbers(n-1);
        return sum;

    }
    public static int factorial(int n){
        if(n<1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
