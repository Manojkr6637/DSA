package RecursionFinish.Assingment;

public class PowerOfThree {
    public static void main(String[] args) {
        int n=3;
       // boolean ans= bf(n);
        // int ans= rm(3, n);
        // return n>0 &&ans==n;
       // ans=(n>0 &&ans==n);
        //The positive divisors of 319 are exactly the powers of 3 from 30 to 319. That's all powers of 3 in the possible range here (signed 32-bit integer). So just check whether the number is positive and whether it divides 319.
         boolean ans= bfs(n);
        System.out.print("ans:"+ans);
    }
    static boolean bfs(int n){


        return  n>0 && Math.pow(3,19)%n==0;

    }
    static int m(int b,int n){

        if(n<=1)
            return 1;
        return  b*m(b,n/3);

    }
    static boolean bf(int n){
        if(n==0){
            return false;
        }
        else if(n==1){
            return true;
        }else{
            while(n!=1){
                if(n%3==0){
                    n/=3;
                }else{
                    return false;
                }
            }
            return true;
        }
    }
    static boolean m2(int n){

        return  (n &n-1)==0 &&n>0;

    }
}
