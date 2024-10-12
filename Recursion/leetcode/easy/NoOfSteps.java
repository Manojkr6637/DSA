package RecursionFinish.leetcode.easy;
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
//1342. Number of Steps to Reduce a Number to Zero
public class NoOfSteps {
    public static void main(String[] args) {
        int n=14;
        int ans=rs(n, 0);
        System.out.print("Ans:"+ans);
    }
    static int rs(int n,int s){
        if(n==0)
            return s;
        if(n%2==0)
            return rs(n/2, s+1);
        return  rs(n-1, s+1);
    }
}
