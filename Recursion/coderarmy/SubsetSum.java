package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> temp = new ArrayList<>();
       // List<Integer> ans= subsetsrec(arr, 0, arr.length,temp);
        List<Integer> ans= subsetsrec2(arr, 0, arr.length,0);
        System.out.print(ans);
    }
    static List<Integer> subsetsrec2(int []arr, int index, int n, int sum){

        if(index==n){
            List<Integer> result= new ArrayList<>();

            result.add(sum);
            return result;
        }

        // No included
        List<Integer> left= subsetsrec2(arr, index+1,n, sum);

        // Included

        sum+=arr[index];
        List<Integer> right= subsetsrec2(arr, index+1,n, sum);

        left.addAll(right);
        return left;
    }
    static List<Integer> subsetsrec(int []arr, int index, int n, ArrayList<Integer>temp){

        if(index==n){
            List<Integer> result= new ArrayList<>();
            int sum=0;
            for(int item:temp){
                sum+=item;
            }
            result.add(sum);
            return result;
        }

        // No included
        List<Integer> left= subsetsrec(arr, index+1,n, temp);

        // Included
        temp.add(arr[index]);
        List<Integer> right= subsetsrec(arr, index+1,n, temp);
        temp.remove(Integer.valueOf(arr[index]));
        left.addAll(right);
        return left;
    }
}
