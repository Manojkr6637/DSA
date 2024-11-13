package RecursionFinish.Assingment;

import java.util.Arrays;

public class BubbleSortR {
    public static void main(String[] args) {
        int []arr={5,1 ,4, 2, 8};
        //bs(arr);
        bsr(arr, 0, arr.length-1);
        System.out.print("Ans"+ Arrays.toString(arr));
    }
    static void bsr(int []arr, int c, int r){
        if(r==0)
            return;
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bsr(arr, c+1, r);
        }else{
            bsr(arr, 0, r-1);
        }


    }
    static void bs(int []arr){
        int ln=arr.length;

        for(int r=0;r<ln-1; r++){
            for(int c=0;c<ln-1-r;c++){
                if(arr[c]>arr[c+1]){
                    int temp=arr[c];
                    arr[c]=arr[c+1];
                    arr[c+1]=temp;
                }

            }
        }
    }
}
