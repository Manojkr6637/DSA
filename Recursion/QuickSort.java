package RecursionFinish;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr={1, 3,2,5,4};
        qs(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    static void qs(int []arr, int l, int h){
        if(l>=h)
            return;
        int s=l;
        int e=h;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        while (s<=e){
             while (arr[s]<pivot)
                    s++;
            while (arr[e]>pivot)
                e--;
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        qs(arr, l, e);
        qs(arr, s, h);
    }
}
