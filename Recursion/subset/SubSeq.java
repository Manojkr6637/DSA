package RecursionFinish;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq {
    public static void main(String[] args) {
//        subseq("","abc");
        ArrayList<String> ans= subseqP("","abc");
      //  ArrayList<String> ans1= subseqP1("","abc", new ArrayList<String>());
         ArrayList<String> ans2= subseqAscii("","abc", new ArrayList<String>());
        System.out.print("ans"+ans2);
    }
    static ArrayList<String> subseqAscii(String p, String up,ArrayList<String>list){

        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        subseqAscii(p+ch,up.substring(1), list);
        subseqAscii(p+(ch+0),up.substring(1), list);
        subseqAscii(p,up.substring(1), list);
        return list;
    }
    static ArrayList<String> subseqP1(String p, String up,ArrayList<String>list){

        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        subseqP1(p,up.substring(1), list);
        subseqP1(p+ch,up.substring(1), list);
//        ArrayList<String> left= subseqP(p,up.substring(1));
//        ArrayList<String> right= subseqP(p+ch,up.substring(1));
//        left.addAll(right);
        return list;
    }
    static ArrayList<String> subseqP(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left= subseqP(p,up.substring(1));
        ArrayList<String> right= subseqP(p+ch,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subseq(p,up.substring(1));
        subseq(p+ch,up.substring(1));

    }
}
