package RecursionFinish;

public class RevOfDigit {
    public static void main(String[] args) {
        int n=1234;
      //  int ans=irev(n);
//        int ans=rrev(n, 0);
        int ans=rrev2(n);
        System.out.print("Ans:"+ans);
    }
    static int rrev2(int n){
        int digits=(int)Math.log10(n)+1;
        return helper(n,digits);
    }
   static int helper(int n, int digits){
        if(n==0)
            return 0;
        return (n%10)*(int)Math.pow(10, digits-1)+helper(n/10, digits-1);
    }
    static int rrev(int n,int rev){
        if(n==0)
            return rev;
        rev=rev*10+(n%10);
        return  rrev(n/10, rev);
    }
    static int irev(int n){
        int rev=0;
        while (n>0){
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }

}
