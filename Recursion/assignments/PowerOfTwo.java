package RecursionFinish.Assingment;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=-2147483648;
        //       1.m1(n)
        if(n<1){
            n*=-1;
        }
              boolean ans= m2(n); // Bitwise Operator
        System.out.print("ans:"+ans);
    }
    static boolean m2(int n){

        return  (n &n-1)==0 &&n>0;

    }
    static void m1(){
        int n=-32;
        if(n<1){
            n=-1*n;
        }
        int ans=p(2,n);
        if(n<1){
            ans=-1*ans;
        }
        System.out.print("Ans:"+ (ans==n));
    }
    static int p(int b, int n){
        if(n==1)
            return 1;
        return b*p(b, n/2);

    }
}
