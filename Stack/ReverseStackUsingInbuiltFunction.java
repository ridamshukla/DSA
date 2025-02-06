package Stack;


import java.util.Stack;

public class ReverseStackUsingInbuiltFunction {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        Stack<Integer> r = new Stack<>();
        while(s.size() >= 1){
            int ele = s.pop();
            r.push(ele);
        }

        System.out.println(r);
    }
}
