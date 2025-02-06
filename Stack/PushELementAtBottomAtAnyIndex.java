package Stack;

import java.util.Stack;

public class PushELementAtBottomAtAnyIndex {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);


        Stack<Integer> r = new Stack<>();
        while(s.size() >= 3){
            r.push(s.pop());
        }

        Stack<Integer> rs = new Stack<>();
        while(r.size() >= 1){
            rs.push(r.pop());
        }

        System.out.println(rs);
    }
}
