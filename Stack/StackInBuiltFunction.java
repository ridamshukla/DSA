package Stack;

import java.util.Stack;

public class StackInBuiltFunction {
    public  static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        // push to add data in stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        // pop to remove data in stack top most data stack work on lifo
        // last in first out so 5 will remove from stack
        s.pop();

        // peek to provide top most data
        s.peek();

        // isempty check stack is empty or not if empty they will give you true
        s.isEmpty();



    }

}
