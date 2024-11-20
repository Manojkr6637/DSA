package recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={6,2,1,3,4};
        System.out.print("Before Sort:"+ Arrays.toString(arr));
         ms(arr,0,arr.length-1);
        System.out.print("After Sort:"+ Arrays.toString(arr));


    }
    static void  ms(int [] arr,int start,int end){
        if(start==end)
            return;
        int m=start+(end-start)/2;
        ms(arr, start, m);
        ms(arr, m+1, end);
        s(arr, start, m, end);
    }
    static void s(int arr[], int s, int m, int e){
                int l=s;
                int r=m+1;
                int temp[]=new int[e-s+1];
                int k=0;
                while(l<=m && r<=e){
                    if(arr[l]<=arr[r]) {
                        temp[k] = arr[l];
                        l++;
                    }else {
                        temp[k] = arr[r];
                        r++;
                    }
                    k++;

                }
        while(l<=m){
                temp[k] = arr[l];
                l++;
                k++;
        }
        while(r<=e){
                temp[k] = arr[r];
                r++;
                k++;
        }
         k=0;
        while(s<=e){
            arr[s] = temp[k];
            k++;
            s++;
        }
    }
}
