package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceString {
    public static void main(String[] args) {

        String str="abc";
        List<String>ans=new ArrayList<>();
        subString(str, 0, str.length(),"",ans);

        System.out.print(ans);

    }
    static void subString(String up, int index, int n, String p,List<String>ans){

        if(index==n){
            ans.add(p);
            return;
        }
// Array pass reference but String not pass reference
        // no included
        subString(up, index+1, n,p,ans);
        // included

        p+=up.charAt(index);
        subString(up, index+1, n,p,ans);

    }

}
