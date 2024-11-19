package recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int arr[]={1, 2,3,4,5};
       // 1. p(arr,0);// Print recursive
        //2. pr(arr,0);
//       3.int ans= sum(arr,0);
//       4.int ans= min(arr,0);
         String str="manoj";
      // 5. int ans= pal(str,0,str.length()-1);
//        6.int ans= countVowel(str,0);
        char []cArr=str.toCharArray();
        //8.char []ans=  revS(cArr,0,str.length()-1);
        //9.
        char []ans=  lowerTouppper(cArr,0);
//       System.out.print("Ans:"+ans);

        System.out.print(Arrays.toString(ans));
    }
    static char[]  lowerTouppper(char[] carr,int index){
        if(carr.length==index) {
//            System.out.print(Arrays.toString(carr));
            return carr;
        }

        carr[index]=(char)('A'+carr[index]-'a');
        return lowerTouppper(carr, index+1);

    }
    static char[]  revS(char[] carr,int start, int end){
        if(start>=end) {
//            System.out.print(Arrays.toString(carr));
            return carr;
        }
        char temp=carr[start];
        carr[start]=carr[end];
        carr[end]=temp;
        return revS(carr, start+1,end-1);

    }
    static int countVowel(String str,int index){
        if(str.length()==index)
            return 0;
        if(str.charAt(index)=='a'||str.charAt(index)=='e'
        ||str.charAt(index)=='i'||str.charAt(index)=='o'||str.charAt(index)=='u')
            return 1+countVowel(str, index+1);

        return countVowel(str, index+1);

    }
    static int min(int []arr,int index){
        if(arr.length-1==index)
            return arr[index];
        return Math.min(arr[index], min(arr,index+1));

    }
    static int sum(int []arr,int index){
        if(arr.length==index)
            return 0;

      return arr[index]+ sum(arr,index+1);

    }
    static void pr(int []arr,int index){
        if(arr.length==index)
            return;
        pr(arr,index+1);
        System.out.print(" "+arr[index]);
    }
    static void p(int []arr,int index){
        if(arr.length==index)
            return;
        System.out.print(" "+arr[index]);
        p(arr,index+1);
    }
}
