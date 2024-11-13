package RecursionFinish.Assingment;

import java.util.Arrays;

public class SumOfDigit {
    public static void main(String[] args) {
        int n=12345;

//        System.out.print("Ans:"+ sum(n));
        System.out.print("Ans:"+ sumr(n));
    }
    static int sumr(int n){
        if(n==0)
            return 0;
        return n%10+sumr(n/10);

    }
    static int sum(int n){
        int sum=0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;

    }
}
