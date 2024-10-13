package RecursionFinish;

import java.util.ArrayList;

public class LinearSearch {
    static ArrayList<Integer>list=new ArrayList<>();
    public static void main(String[] args) {
        int []arr={1,4,34,4, 4,6,9};
        int t=4;
//        int ans=linearISearch(arr,  t);
//        int ans=linearRSearch(arr, 0, t);
       // boolean ans=linearRSearch3(arr, 0, t);
      //  linearRSearch4(arr, 0, t);
//        linearRSearch5(arr, 0, t,list);
      //  System.out.print("Ans:"+ans);
//        System.out.print("Ans:"+list);
       // System.out.print("Ans5:"+linearRSearch5(arr, 0, t,list));
        System.out.print("Ans5:"+linearRSearch6(arr, 0, t));
    }
    static ArrayList<Integer> linearRSearch6(int []arr, int index, int t){
        ArrayList<Integer>list= new ArrayList<>();
        if(arr.length==index)
            return list;
        if(arr[index]==t){
            list.add(index);
        }
        ArrayList<Integer>ans= linearRSearch6(arr, index+1, t);
        list.addAll(ans);
        return list;

    }
    static ArrayList<Integer> linearRSearch5(int []arr, int index, int t, ArrayList<Integer>ans){
        if(arr.length-1==index)
            return ans;
        if(arr[index]==t){
            ans.add(index);
        }
        return linearRSearch5(arr, index+1, t,ans);

    }
    static void linearRSearch4(int []arr, int index, int t){
        if(arr.length-1==index)
            return;
        if(arr[index]==t){
            list.add(index);
             }
        linearRSearch4(arr, index+1, t);

    }
    static boolean linearRSearch3(int []arr, int index, int t){
        if(arr.length-1==index)
            return false;

        return arr[index]==t || linearRSearch3(arr, index+1, t);

    }
    static int linearISearch(int []arr, int t){
       int ln=arr.length;
       for(int i=0;i<ln;i++) {
           if (arr[i] == t)
               return i;
       }
      return -1;

    }
    static int linearRSearch(int []arr, int index, int t){
        if(arr.length-1==index)
            return-1;
        if(arr[index]==t){
            return index;}
        return linearRSearch(arr, index+1, t);

    }
}
