package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        int []arr={1, 2,3 };
        ArrayList<Integer>temp=new ArrayList<>();
        //ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
       // sub(arr, 0, arr.length,temp,ans);
        List<List<Integer>> ans= subsetsrec(arr, 0, arr.length,temp);

        System.out.print(ans);

    }

    static List<List<Integer>> subsetsrec(int []arr, int index, int n, ArrayList<Integer>temp){

        if(index==n){
            List<Integer> res=new ArrayList<>(temp);
            List<List<Integer>> result=new ArrayList<>();
            result.add(res);
            return result;
        }

        // No included
        List<List<Integer>> left= subsetsrec(arr, index+1,n, temp);

        // Included
        temp.add(arr[index]);
        List<List<Integer>> right= subsetsrec(arr, index+1,n, temp);
        temp.remove(Integer.valueOf(arr[index]));
          left.addAll(right);
            return left;
    }
    static void sub(int []arr, int index, int n, ArrayList<Integer>temp,ArrayList<ArrayList<Integer>>ans){

        if(index==n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        // No included
        sub(arr, index+1,n, temp, ans);

        // Included
        temp.add(arr[index]);
        sub(arr, index+1,n, temp, ans);
        temp.remove(Integer.valueOf(arr[index]));

    }
}
