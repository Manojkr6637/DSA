package recursion;

public class GCD {
    public static void main(String[] args) {
        int a=36;
        int b=24;
        int ans=getGCD(a, b);
        System.out.print("Ans:" +ans);
    }
    static int getGCD(int a, int b){

        if(b==0)
            return a;
        return getGCD(b, a%b);
    }
}
