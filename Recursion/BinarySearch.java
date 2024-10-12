package RecursionFinish;

public class BinarySearch {
    public static void main(String[]args){
        int []arr={1, 2, 3, 4, 5};
        int ln=arr.length;

        int e=ln-1;
        int t=22;
       // int ansi=ibs(arr, 0, e, t);//tc:O(log(n)) ts:O(1)//no extra space
        int ansr=rbs(arr, 0, e, t);
//        System.out.print("ans:"+ans);//tc:O(log(n)) ts:O(1)
        System.out.print("ans:"+ansr);
    }
    static int rbs(int []arr, int s, int e, int t){

           if(s>e)
               return -1;
           int m=s+(e-s)/2;
            if(arr[m]==t)
                return m;
            if(arr[m]<t)
               return rbs(arr, m+1, e,t);
            else
             return rbs(arr, s, m-1,t);



    }
    static int ibs(int []arr, int s, int e, int t){
        int m;
        while(s<=e){
            m=s+(e-s)/2;
            if(arr[m]==t)
                return m;
            if(arr[m]<t)
                s=m+1;
            else
                e=m-1;
        }
        return -1;
    }
}
