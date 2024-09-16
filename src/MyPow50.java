public class MyPow50 {
    public static void main(String[] args) {
        System.out.println(myPow(2.000, -2));

    }

    public static double myPow(double x, int n) {

        if(n==0){
            return 1;
        }
        if(n<0){


            return 1/myPow(x, -1*n);
        }
        double ans= myPow(x, n/2);
        if(n%2==0){
            return ans*ans;
        }else{
            return ans*ans*x;
        }
    }

    }


