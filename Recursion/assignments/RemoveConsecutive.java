package RecursionFinish.Assingment;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
//https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
public class RemoveConsecutive {
    public static void main(String[] args) {
        String s="aabccba";
        String ans=removei(s);
      //  String ans=remove(s);
        System.out.print("ans:"+ans);
    }
    static String removei(String s){

        String ns="";
        int i=0;
        int j=0;
        while(j<s.length()){
              if(s.charAt(i)==s.charAt(j)){
                  j++;
              }
              else if(s.charAt(i)!=s.charAt(j) || j==s.length()-1){
                  ns+=s.charAt(i);
                  i=j;
                  j++;
              }

        }
        ns+=s.substring(j-1);
        return ns;

    }
    static String remove(String s){

         if(s.length()<=1)
             return s;
         if(s.charAt(0)==s.charAt(1))
              return remove(s.substring(1));
         else
             return s.charAt(0)+ remove(s.substring(1));

    }
}
