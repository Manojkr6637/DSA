package RecursionFinish;

public class RotatedBS {
    public static void main(String[] args) {

            int []arr={5, 6,7,8,9, 1, 2,3};
            int t=6;
            int ans=bs(arr, 0, arr.length-1,t);
            System.out.print(ans);
    }
    static int bs(int []arr, int s, int e, int t){
            int m=s+(e-s)/2;
            if(s>e)
                return -1;
            if(t==arr[m])
                return m;
            if(arr[s]<=arr[m]){
                if(t>arr[s] && t<arr[m]){
                   return bs(arr, s, m-1, t);
                }else {
                   return bs(arr, m+1, e, t);
                }
            }
        if(t>=arr[m] && t<=arr[e]){
            return bs(arr, m+1, e, t);
        }
        return bs(arr, s, m-1, t);

    }
}
