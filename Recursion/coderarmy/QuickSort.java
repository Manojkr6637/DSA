package recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={6,2,1,3,4};
        System.out.print("Before Sort:"+ Arrays.toString(arr));
        qs(arr,0,arr.length-1);
        //avergage time complexity
        //tc:nlogn
        // sc:nlon
        // array is already sorted:
        //tc:O(n2)
        // sc:n
        System.out.print("After Sort:"+ Arrays.toString(arr));


    }
    static void  qs(int [] arr,int start,int end){
        //base condition
        if(start>=end)
            return;
        int pivot=partion(arr, start,end);
        qs(arr, start, pivot-1);
        qs(arr, pivot+1,end);
    }
    static int partion(int arr[],int start, int end){
          int pos=start;
          for(int i=start;i<=end;i++){
                 if(arr[i]<=arr[end]){
                     int temp=arr[i];
                     arr[i]=arr[pos];
                     arr[pos]=temp;
                     pos++;
                 }
          }
          return pos-1;
    }
}
