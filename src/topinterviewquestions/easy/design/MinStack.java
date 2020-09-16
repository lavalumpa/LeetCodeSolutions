package topinterviewquestions.easy.design;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    private List<Integer> stack;
    private List<Integer> min;

    public MinStack(){
        stack=new ArrayList<>();
        min=new ArrayList<>();
    }

    public void push(int x){
        if (min.isEmpty()|| min.get(min.size()-1)>x) min.add(x);
        else min.add(min.get(min.size()-1));
        stack.add(x);
    }

    public void pop(){
        stack.remove(stack.size()-1);
        min.remove(min.size()-1);
    }


    public int top(){
        return stack.get(stack.size()-1);
    }

    public int getMin(){
        return min.get(min.size()-1);
    }

}
