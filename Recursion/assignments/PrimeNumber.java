package RecursionFinish.Assingment;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=8;
        //System.out.print("Ans:"+ prime(n));
//        System.out.print("Ans:"+ primeT(n));
        System.out.print("Ans:"+ primeR(n,2));
    }
    static int primeR(int n,int i){
           if(n==i)
               return 1;
            if(n%i==0)
                return 0;

        return primeR(n,i+1);

    }
    static int primeT(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0)
                return 0;
        }
        return 1;

    }
    static int prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return 0;
        }
        return 1;

    }
}
