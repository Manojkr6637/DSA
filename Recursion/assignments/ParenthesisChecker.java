package RecursionFinish.Assingment;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String s="}{";
        boolean ans=checkParenthesis(s);
        System.out.print("ans:"+ans);
    }
    static boolean checkParenthesis(String s){
        int ln=s.length();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<ln;i++){
            char c=s.charAt(i);
            char cs= !stack.isEmpty() ?stack.peek():'\0';
            if((cs=='(' && c==')') || (cs=='{' && c=='}')  ||
                    (cs=='[' && c==']')){
                stack.pop();
            }else{
                stack.push(c);
            }

        }

        return stack.isEmpty()?true:false;

    }
}
