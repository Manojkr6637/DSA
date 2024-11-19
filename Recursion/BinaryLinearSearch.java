package recursion;

import java.util.Arrays;

public class BinaryLinearSearch {
    public static void main(String[] args) {
        int arr[]={1, 2,3,4,5};
        int target=4;
//        int ans=  lSearch(arr,0,target);
        int ans=  bSearch(arr,0,arr.length-1, target);
       System.out.print("Ans:"+ans);


    }
    static int  bSearch(int [] arr,int start,int end,int target){
        if(start>end) {
            return -1;
        }
        int m=start+(end-start)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return bSearch(arr,start,m-1, target);
        }
        return bSearch(arr,m+1,end, target);

    }
    static int  lSearch(int [] arr,int index,int target){
        if(arr.length==index) {
            return -1;
        }

        if(arr[index]==target){
            return index;
        }
        return lSearch(arr, index+1,target);

    }
}
