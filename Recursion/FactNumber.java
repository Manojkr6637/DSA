public class FactNumber {
    public static void main(String[] args) {

        factNumber();
    }
    static void factNumber(){
        int n=5;
        //1. Iterative
       //  iFact(n);
        //3. Recursive
        int ans= recursiveFact(n);
        System.out.println("Recursive Ans:"+ans);

    }
    static void iFact(int n){
        int i, fact=1;

        for(i=1; i<=n;i++){
            fact*=i;
        }
        System.out.println("Iterative Ans:"+fact);
        //tc:O(n)
        //sc:O(1)
    }
    static int recursiveFact(int n){
        if(n<1)
            return 1;
        return recursiveFact(n-1)*n;
        //tc:O(n)
        //sc:O(1)
    }
}
