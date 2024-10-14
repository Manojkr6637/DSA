package RecursionFinish;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int []arr={4,3,2,1};
       //  selectionsort(arr);
       // rselectionsort(arr, 1, arr.length,0,0);// min values
        rselectionsortMax(arr, 1, arr.length-1,0);// max values
        System.out.print(Arrays.toString(arr));
    }
    static void rselectionsortMax(int []arr, int c,int r,int maxIndex){
        if(r==0)
            return;
        if(c<=r){
            if(arr[c]>arr[maxIndex]){

                rselectionsortMax(arr, c+1,r,c);
            }else{
                rselectionsortMax(arr, c+1,r,maxIndex);
            }

        }else{
            int temp=arr[r];
            arr[r]=arr[maxIndex];
            arr[maxIndex]=temp;
            rselectionsortMax(arr, 0,r-1,0);
        }

    }
    static void rselectionsort(int []arr, int c,int r,int minIndex, int index){
        if(r==index)
            return;
        if(c<r){
            if(arr[c]<arr[minIndex]){
                minIndex=c;
                rselectionsort(arr, c+1,r,minIndex,index);
            }else{
                rselectionsort(arr, c+1,r,minIndex, index);
            }

        }else{
            int temp=arr[minIndex];
            arr[minIndex]=arr[index];
            arr[index]=temp;
            index++;
            rselectionsort(arr, index+1,r,index,index);
        }

    }
    static void selectionsort(int []arr){
        int ln=arr.length;
        for(int i=0;i<ln;i++){
            int minindex=i;
            for(int j=i+1; j<ln;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }
}
