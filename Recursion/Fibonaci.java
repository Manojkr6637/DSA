import java.util.Arrays;

public class Fibonaci {
     public  static int n=7;
    static int[]dp=new int[n+1];


    public static void main(String[] args) {
 
//        System.out.println(fib(n));//tc:O( 2 of power n) sc:O(n)
//        System.out.println(ifib(n));//tc:O(n) sc:O(1)
        // memoizations
        Arrays.fill(dp, -1);
        System.out.println(mfib(n));//tc:O(n) sc:O(n)
    }
    static int ifib(int n){
        if(n<=1)
            return n;
       int prev=0, current=1;
       int next;
       for(int i=2; i<=n; i++){
           next=prev+current;
           prev=current;
           current=next;
       }
       return current;
    }
    static int fib(int n){
        if(n<=1)
            return n;
     return fib(n-1)+fib(n-2);
    }
    static int mfib(int n){
        if(n<=1) {
            dp[n] = n;
            return dp[n];
        }
        if(dp[n-1]==-1) {
            dp[n-1] = mfib(n-1);
        }
        if(dp[n-2]==-1) {
            dp[n-2] = mfib(n-2);
        }
        dp[n]=dp[n-1]+dp[n-2];
        return dp[n];
    }
}
