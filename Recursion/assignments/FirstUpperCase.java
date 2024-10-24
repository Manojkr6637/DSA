package RecursionFinish.Assingment;
//https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstUpperCase {
    public static void main(String[] args) {
        String str="geekS";
//        int ans=getUpperCase(str);
//        if(ans>0)
//          System.out.print("Ans:"+(char)ans);
//        else
//            System.out.print("Ans: Not available");

        //Time complexity: O(n), O(1)
        //Auxilary complexity: O(n), O(n)

        // for recursive
        int ans=getUpperCaseR(str,0);
        if(ans>0)
          System.out.print("Ans:"+(char)ans);
        else
            System.out.print("Ans: Not available");

    }
    static int getUpperCaseR(String str,int index){
        if(str.length()==index)
            return 0;
        else{
            int ch=str.charAt(index);
           if(ch>=65 && ch<=90)
             return ch;
            return getUpperCaseR(str, index+1);
        }

    }
    static int getUpperCase(String str){
        int len=str.length();
        for(int i=0;i<len;i++){
            int ch=str.charAt(i);
            if(ch>=65 && ch<=90)
                return str.charAt(i);
        }
        return -1;
    }
}
