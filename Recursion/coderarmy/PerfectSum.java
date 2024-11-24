package recursion;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/0
public class PerfectSum {
    public static void main(String[] args) {
        int[] arr = {0, 10, 0};
        int target=0;
        int ans= subsetsSumPerfectCount(arr, 0, arr.length,target);
        System.out.print(ans);
    }
    static int subsetsSumPerfectCount(int []arr, int index, int n,int target){



        if(index==n){
            return target==0?1:0;
        }


              return   subsetsSumPerfectCount(arr, index+1,n,target)+
                subsetsSumPerfectCount(arr, index+1,n,target-arr[index]);



    }
}
