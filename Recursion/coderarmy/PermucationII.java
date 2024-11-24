package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermucationII {
    public static void main(String[] args) {
        int arr[]={1,1,2};
          m2(arr);

    }
    static void m2(int []arr){
        List<List<Integer>> ans=new ArrayList<>();

        prno(arr,ans,0);
        System.out.print("Permutation:"+ ans);
    }
    static void prno(int []arr, List<List<Integer>> ans,int index){
        if(arr.length==index){
            ArrayList<Integer> result=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                result.add(arr[i]);
            }
            ans.add(new ArrayList<>(result));
            return;
        }
         int []use=new int[21];
         Arrays.fill(use, 0);
        for(int i=index;i<arr.length;i++){
            if(use[arr[i]+10]==0) {
                //use[use[i]+10]=1;
                swap(arr, index, i);
                prno(arr, ans, index + 1);
                swap(arr, index, i);
                use[arr[i]+10]=1;
            }
        }

    }
    static void swap(int []arr, int index, int index2){
        int temp=arr[index];
        arr[index]=arr[index2];
        arr[index2]=temp;

    }
}
