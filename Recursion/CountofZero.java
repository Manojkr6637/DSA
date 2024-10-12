package RecursionFinish;

public class CountofZero {
    public static void main(String[] args) {
        int n=12304;
      //  int ans=ic(n);
        int ans=rc(n, 0);
        System.out.print("Ans:"+ans);
    }
    static int rc(int n,int c){
            if(n==0)
                return c;
            int r=n%10;
            if(r==0)
               return rc(n/10, c+1);
        return  rc(n/10, c);
    }
    static int ic(int n){
        int c=0;
        while (n>0){
                int r=n%10;
                if(r==0)
                    c++;
                n/=10;
        }
        return c;
    }
}
