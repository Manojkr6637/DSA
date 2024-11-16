package RecursionFinish.Assingment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PowerSetLexicalOrder {
    public static void main(String[] args) {
        String s="cab";
//        powerSet("",s);
      //  ArrayList<String> ans=  powerSetList("",s);
     //   System.out.print("Ans before sort: " +ans);
      //  Collections.sort(ans);
      //  System.out.print("Ans after sort: " +ans);
        powerSetr(s);
    }
    static void powerSetr(String s){
        char []st=s.toCharArray();
        Arrays.sort(st);
        perPowerSet(new String(st), s.length(), -1, "");
    }
    static void perPowerSet(String s, int n, int index, String curr){
        if(index==n){
            return;
        }
        System.out.print(" "+curr);
        for(int i=index+1;i<n;i++){
              curr+=s.charAt(i);
              perPowerSet(s, n,i,curr);
              curr=s.substring(0,curr.length()-1);
        }
        return;

    }
    static void powerSet(String p, String up){
          if(up.isEmpty()) {
              System.out.print(" " + p);
              return;
          }

          char c=up.charAt(0);
          powerSet(p+c, up.substring(1));
          powerSet(p, up.substring(1));

    }
    static ArrayList<String> powerSetList(String p, String up){
        if(up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
        //    System.out.print(" " + p);
            if(!p.isEmpty())
                list.add(p);
            return list;
        }

        char c=up.charAt(0);
        ArrayList<String> left=  powerSetList(p+c, up.substring(1));
        ArrayList<String> right=  powerSetList(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
