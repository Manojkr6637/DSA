package RecursionFinish.Assingment;

public class MinMax {
    public static void main(String[] args) {
        int []arr={1, 2, 3, 4, 5, 6};

       // minmaxi(arr);
        //int min=arr[0];
        //int max=arr[0];
       // minmaxr(arr,1, min,max);

         System.out.print("Max:"+maxr2(arr,arr.length));
        System.out.print("MIn:"+ minr2(arr,arr.length));
    }
    public static int minr2(int []arr, int n){
        if(n==1) {
            return arr[0];
        }

       return Math.min(arr[n-1], minr2(arr, n-1));

    }
    public static int maxr2(int []arr, int n){
        if(n==1) {
            return arr[0];
        }

        return Math.max(arr[n-1], maxr2(arr, n-1));

    }
    public static void minmaxi(int []arr){
        int min=arr[0];
        int max=arr[0];
        for(int index=1; index<arr.length;index++){
        if(arr[index]<min)
            min=arr[index];
        if(arr[index]>max)
            max=arr[index];
        }
        System.out.print("Min and Max" + min + " " + max);

    }
    public static void minmax(int []arr, int index, int min, int max){
            if(arr.length==index) {
                System.out.print("Min and Max" + min + " " + max);
                return;
            }
            if(arr[index]<min)
                min=arr[index];
            if(arr[index]>max)
               max=arr[index];
        minmax(arr, index+1, min, max);

    }
}
