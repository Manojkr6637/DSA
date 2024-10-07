public class Sum {
    public static void main(String[] args) {
        sumNaturalNumber();
    }
    static void sumNaturalNumber(){
        int n=5;
        //1. Math Formula n(n+1)/2
      //  sumMath(n);
        //2. Loop
       // sumLoop(n);
        //3. Recursive
       int ans= sumRecursive(n);
       System.out.println("Recursive Ans:"+ans);

    }
    static void sumMath(int n){
        //Math Formula n(n+1)/2
        int ans=n*(n+1)/2;
        System.out.println("Ans:"+ans);
        //tc:O(1)
        //sc:O(1)
    }
    static void sumLoop(int n){
        int i, sum=0;

        for(i=1; i<=n;i++){
            sum+=i;
        }
        System.out.println("Ans:"+sum);
        //tc:O(n)
        //sc:O(1)
    }
    static int sumRecursive(int n){
        if(n==0)
            return 0;
        return sumRecursive(n-1)+n;


        //tc:O(n)
        //sc:O(n)
    }

}
