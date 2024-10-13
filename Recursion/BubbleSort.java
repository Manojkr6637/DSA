package RecursionFinish;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={100,1,3,4,7,9,2,40};
       // bsort(arr);
        rbsort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    static void rbsort(int []arr, int c,int r){
       if(r==0)
           return;
       if(c<r){
           if(arr[c]>arr[c+1]){
               int temp=arr[c];
               arr[c]=arr[c+1];
               arr[c+1]=temp;
           }
           rbsort(arr, c+1,r);
       }else{
           rbsort(arr, 0,r-1);
       }

    }
    static void bsort(int []arr){
        int ln=arr.length;
        for(int i=0;i<ln-2;i++){
            for(int j=0; j<ln-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
