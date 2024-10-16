package RecursionFinish;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        //p("", "abc");
       // ArrayList<String> result= pList("", "abc");
        //System.out.print(result);
        int countp=countP("", "abc");
        System.out.print("countp: "+countp);
    }
    static int countP(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<String>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
            count+=countP(f+ch+s, up.substring(1));
        }
        return count;
    }
    static ArrayList<String> pList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<String>();
            list.add(p);

            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<String>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
            ans.addAll(pList(f+ch+s, up.substring(1)));
        }
        return ans;
    }
    static void p(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
            p(f+ch+s, up.substring(1));
        }
    }
}
