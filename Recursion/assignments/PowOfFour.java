package RecursionFinish.Assingment;

public class PowOfFour {
    public static void main(String[] args) {
        int n=4;
        // boolean ans= bf(n);
      //   int res= m(4, n);
        // return n>0 &&ans==n;
       // boolean ans=(n>0 &&res==n);
        //The positive divisors of 319 are exactly the powers of 3 from 30 to 319. That's all powers of 3 in the possible range here (signed 32-bit integer). So just check whether the number is positive and whether it divides 319.
      //  boolean ans= bfs(n);
        boolean ans=getBit(n);
        System.out.print("ans:"+ans);
    }
    static boolean getBit(int n){
        return  n>0 && (n&n-1)==0 && (n-1)%3==0;

    }
    static boolean bfs(int n){
        return  n>0 && Math.pow(4,15)%n==0;

    }
    static int m(int b,int n){

        if(n<=1)
            return 1;
        return  b*m(b,n/4);

    }
    static boolean bf(int n){
        if(n==0){
            return false;
        }
        else if(n==1){
            return true;
        }else{
            while(n!=1){
                if(n%4==0){
                    n/=4;
                }else{
                    return false;
                }
            }
            return true;
        }
    }

}
