package recursion;
//https://www.geeksforgeeks.org/problems/ways-to-sum-to-n5759/1
public class SumTarget {
    static final int MOD = 1000000007;
    //static int c=0;
    public static void main(String[] args) {
        int []arr={1,5,6};
        int target=7;

       int ans= p(arr, target);
        System.out.print("ans:"+ans);
    }
    static int p(int []arr, int target){
         if(target==0) {

             return 1;
         }
        if(target<0) {
            return 0;
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int res=  p(arr, target-arr[i]);
            ans+=(res%MOD);
        }
        return ans;
    }
}
