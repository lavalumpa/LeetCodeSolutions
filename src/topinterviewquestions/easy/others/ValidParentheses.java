package topinterviewquestions.easy.others;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> par=new Stack<>();
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i) =='(') {
                par.push(s.charAt(i));
            }
            if (s.charAt(i)=='}'){
                if (!par.empty()&& par.peek()=='{') {
                    par.pop();
                } else {
                    return false;
                }
            }
            if (s.charAt(i)==')'){
                if ( !par.empty() &&par.peek()=='(') {
                    par.pop();
                } else {
                    return false;
                }
            }
            if (s.charAt(i)==']'){
                if (!par.empty()&& par.peek()=='[') {
                    par.pop();
                } else {
                    return false;
                }
            }
        }
        return par.empty();
    }
}
