package RecursionFinish.Assingment;

public class StringLength {
    public static void main(String[] args) {
        String str="abcd";
//        System.out.print(getLen(str, 0));
        System.out.print(getLen2(str));
    }
    static int getLen2(String str){
          if(str.isEmpty())
              return 0;
         return  1+getLen2(str.substring(1));
    }
    static int getLen(String str, int index){
        if(str.length()==index)
            return 0;
        return  1+getLen(str, index+1);
    }
}
