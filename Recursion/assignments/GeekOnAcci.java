package RecursionFinish.Assingment;

public class GeekOnAcci {
    public static void main(String[] args) {
        int a=1;
        int b=3;
        int c=2;
        int n=4;
        System.out.print(sum(a,b,c, n));
    }
    static int sum(int a, int b, int c, int n){
        if(n==1)
            return a;
        if(n==2)
            return b;
        if(n==3)
            return c;
        return sum(a,b,c,n-1)+sum(a,b,c,n-2)+sum(a,b,c,n-3) ;
    }
}
