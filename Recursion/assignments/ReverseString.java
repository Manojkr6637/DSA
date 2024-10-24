package RecursionFinish.Assingment;

import java.util.Arrays;

//https://leetcode.com/problems/reverse-string/description/
public class ReverseString {
    public static void main(String[] args) {
        char []s={'h', 'e','l','l','o'};
        // method 1. Iterative
        //  char []ans=getRevI(s);
        // System.out.print("ANs:"+ Arrays.toString(ans));
        // method 2. Recursive
        char []ans=getRevR(s, 0, s.length-1);
        System.out.print("ANs:"+ Arrays.toString(ans));
    }
    static char[] getRevR(char []carr, int s, int e){

        if(s>e)
            return carr;
        char temp=carr[s];
        carr[s]=carr[e];
        carr[e]=temp;
        return getRevR(carr,s+1, e-1);
    }
    static char[] getRevI(char []carr){
          int len=carr.length;
          if(len==0)
              return carr;
          int s=0;
          int e=len-1;
          for(s=0; s<e;s++, e--){
              char temp=carr[s];
              carr[s]=carr[e];
              carr[e]=temp;
          }
          return carr;
    }
}
