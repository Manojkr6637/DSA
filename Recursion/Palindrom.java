package RecursionFinish;

public class Palindrom {
    public static void main(String[] args) {
        int n=1721;
       // int ans=irev(n);
       // boolean ans=rrev2(n);
         String str=String.valueOf(n);
         boolean ans=rrev3(str);
        System.out.print("Ans:"+ans);
    }
    static boolean rrev3(String str){
         int s=0;
         int e=str.length()-1;
         while (s<=e){
                    if(str.charAt(s)!=str.charAt(e))
                        return false;
                    s++;
                    e--;
         }
        return true;
    }
    static boolean rrev2(int n){
        int digits=(int)Math.log10(n)+1;
        return n== helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n==0)
            return 0;
        return (n%10)*(int)Math.pow(10, digits-1)+helper(n/10, digits-1);
    }
    static int irev(int n){
        int rev=0;
        int newn=n;
        while (newn>0){
            int r=newn%10;
            rev=rev*10+r;
            newn/=10;
        }
        if(n==rev)
            return 1;

        return 0;

    }
}
