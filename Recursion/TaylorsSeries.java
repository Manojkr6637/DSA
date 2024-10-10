public class TaylorsSeries {
    static double p=1, f=1;
    static double s=1;
    public static void main(String[] args) {

       System.out.println(taylorsNumber(2,3));
       System.out.print(taylorsNumberloop(2,3));
       System.out.print(taylorsNumberRecursive(2,3));
    }
    static double taylorsNumber(int x, int n){
         double r;
           if(n==0)
               return 1;
           r=taylorsNumber(x, n-1);
           p=p*x;
           f=f*n;
           return r+p/f;

    }
    static double taylorsNumberloop(int x, int n){
        double s=1;
        for(;n>0;n--)
            s=1+(x/n)*s;
        return s;

    }
    static double taylorsNumberRecursive(int x, int n){

         if(n==0)
             return s;
         s=1+(x/n)*s;
        return taylorsNumberRecursive(x, n-1);

    }
}
