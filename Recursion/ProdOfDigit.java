package RecursionFinish;

public class ProdOfDigit {
    public static void main(String[] args) {
        int n=123;
        int ans=iprodSum(n);
//        int ans=rprodSum(n);
        System.out.print(ans);
    }
    static int iprodSum(int n){
        int prod=1;
        while (n>0){
            prod*=n%10;
            n/=10;
        }
        return prod;
    }

    static int prodSum(int n){
        if(n%10==n)
            return n;
        return (n%10)*prodSum(n/10);
    }
}
