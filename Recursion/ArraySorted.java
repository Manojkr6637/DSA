package RecursionFinish;

public class ArraySorted {
    public static void main(String[] args) {
         int []arr={1, 2,3,4,5};
//         int ans=isISorted(arr);
        int ln=arr.length;
        // method 3
//        int ans=isRSorted(arr, ln-1);
        boolean ans=isR2Sorted(arr, 0);
         System.out.print("Ans:"+ans);
    }
    static boolean isR2Sorted(int []arr, int index){
        if(arr.length-1==index)
            return true;

        return arr[index+1]>arr[index] &&  isR2Sorted(arr, index+1);
    }
    static int isRSorted(int []arr, int n){
        if(n==0)
            return 1;
        if(arr[n]<arr[n-1])
            return 0;
        return isRSorted(arr, n-1);
    }
    static int isISorted(int []arr){
        int ln=arr.length;
        for(int i=0; i<ln-1;i++){
            if(arr[i+1]<arr[i])
                return 0;
        }
        return 1;
    }
}
