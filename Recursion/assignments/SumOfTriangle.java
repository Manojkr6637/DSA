package RecursionFinish.Assingment;

import java.util.Arrays;

public class SumOfTriangle {
    public static void main(String[] args) {
        int []arr={1, 2, 3, 4, 5};
     //   pt(arr);
        ptr(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void ptr(int []arr){
          if(arr.length==1)
              return;
         int  []temp=new int[arr.length-1];
         helper(temp, arr,0, arr.length-1);
         ptr(temp);
         System.out.println(Arrays.toString(temp));

    }
    public static int [] helper(int []temp, int []arr, int c, int r){
            if(r==c)
                return temp;
        temp[c]=arr[c]+arr[c+1];
       return helper(temp, arr,c+1, r);
    }
    public static void pt(int []arr){
          if(arr.length<1){
              return;
          }
          int []temp=new int[arr.length-1];
          for(int i=0;i<arr.length-1;i++){
              temp[i]=arr[i]+arr[i+1];
          }
          pt(temp);
          System.out.println(Arrays.toString(arr));
    }
}
