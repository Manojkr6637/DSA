package RecursionFinish;

public class SumOfDigit {
    public static void main(String[]args){
        int n=123;
        //M1. Method
       // int ans=sumOfDigit(n);
        //M2. Method
       // int ans1=rsumOfDigit(n, 0);
        //M3. Method
        int ans3=rsumOfDigit3(n);
       // System.out.print("ans:"+ans);
        System.out.print("ans:"+ans3);
    }
    static int rsumOfDigit3(int n){
        if(n==0)
            return 0;

        return (n%10)+rsumOfDigit3(n/10);

    }
    static int rsumOfDigit(int n, int sum){
        if(n==0)
            return sum;
        int r=n%10;
        sum+=r;
        n/=10;
        return rsumOfDigit(n,sum);

    }
    static int sumOfDigit(int n){
        int sum=0;
        while(n>0){
              int r=n%10;
              sum+=r;
              n/=10;
            }
        return sum;

    }
}
