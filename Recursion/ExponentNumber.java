public class ExponentNumber {
    public static void main(String[] args) {

        ExponentNumber();
    }
    static void ExponentNumber(){

        //1. Iterative
          int base=2, pow=3;
        //  iExponent(base, pow);
        //3. Recursive
        // 2 pow 5=2X2X2X2X2
        int ans= recursiveExponent(base, pow);
        System.out.println("Recursive Ans:"+ans);

    }
    static void iExponent(int base, int pow ){
        int i;
        int result=base;
        for(i=1; i<pow;i++){
            result*=base;
        }
        System.out.println("Iterative result:"+result);
        //tc:O(n)
        //sc:O(1)
    }
    static int recursiveExponent(int base, int pow ){
        if(pow==0)
            return 1;
        return recursiveExponent(base, pow-1)*base;
    }
}
