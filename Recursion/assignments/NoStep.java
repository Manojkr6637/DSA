package RecursionFinish.Assingment;

public class NoStep {
    public static void main(String[] args) {
         int n=8;
         int ans=getSteps(n,0);
        System.out.print("ans:"+ans);
    }
    static int getSteps(int n,int s){
        if(n==0)
            return s;

       if(n%2==0){
           return getSteps(n/2,s+1);
       }else{
           return getSteps(n-1,s+1);
       }

    }
}
