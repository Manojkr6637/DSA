package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int arr[]={1,2,3};
      //  m1(arr);// TC:n *fact(n), sc:n

        m2(arr);




    }
    static void m2(int []arr){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        prno(arr,ans,0);
        System.out.print("Permutation:"+ ans);
    }
    static void prno(int []arr, ArrayList<ArrayList<Integer>> ans,int index){
           if(arr.length==index){
                ArrayList<Integer> result=new ArrayList<>();
               for(int i=0;i<arr.length;i++){
                   result.add(arr[i]);
               }
               ans.add(new ArrayList<>(result));
               return;
           }

        for(int i=index;i<arr.length;i++){

            swap(arr,index,i);
            prno(arr,ans,index+1);
            swap(arr,index,i);
        }

    }
    static void swap(int []arr, int index, int index2){
        int temp=arr[index];
        arr[index]=arr[index2];
        arr[index2]=temp;

    }
    static void m1(int []arr){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        int []visited=new int[3];
        Arrays.fill(visited, 0);
        ArrayList<Integer> temp=new ArrayList<>();
        per(arr,visited, temp,ans);
        System.out.print("Permutation:"+ ans);
    }
    static void  per(int arr[],int []visited, ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){

                     if(arr.length==temp.size()){
//                         System.out.print("temp:"+ temp);
                         ArrayList<Integer>rel=new ArrayList<>(temp);
                         ans.add(rel);
                         return;
                     }

                  for(int i=0; i<visited.length;i++){
                      if(visited[i]==0){
                          visited[i]=1;
                          temp.add(arr[i]);
                          per(arr,visited, temp,ans);
                          visited[i]=0;
                          temp.remove(Integer.valueOf(arr[i]));

                      }

                  }
    }
}
