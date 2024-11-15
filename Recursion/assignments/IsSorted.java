package RecursionFinish.Assingment;
// [Write a recursive function to check whether an array is sorted or not.](https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive) `GFG`->✅
public class IsSorted {
    public static void main(String[] args) {
        int []arr={1,3,4,4,5,7};
        int ln=arr.length;
//        boolean ans=isSorted(arr);
          boolean ans=isSortedR(arr,0,ln-1);

        System.out.print("ans:"+ans);
    }
    static boolean isSortedR(int []arr,int c, int r){
        if(c==r)
            return true;

            if(arr[c]>arr[c+1])
                return false;
      return   isSortedR(arr, c+1, r);


    }
    static boolean isSorted(int []arr){
        int ln=arr.length;
        for(int i=0;i<ln-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;

    }
}
