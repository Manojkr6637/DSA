package RecursionFinish.Assingment;

public class SumOfNatural {
    public static void main(String[] args) {
        int n=5;
        System.out.print("Ans:"+ Sum(n));
    }
    static int Sum(int n){
        if(n==1)
            return 1;


        return n+Sum(n-1);

    }
}
