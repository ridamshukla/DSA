package LinkedList;

import Recursion.PrintDecreasingOrder;

public class DisplayLinkedListRecursively {
    public static void main(String[] args){
        Node a = new Node(21);
        Node b = new Node(32);
        Node c = new Node(43);
        Node d = new Node(54);

        a.next = b;
        b.next = c;
        c.next = d;
        Print(a);

    }
    public static void Print(Node temp){
        if(temp == null){
            return;
        }
        System.out.print(temp.val+" ");
        Print(temp.next);
    }

}
