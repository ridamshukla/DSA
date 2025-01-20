package LinkedList;


class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}
public class BasicLinkedLIstConnect {
    public static void main(String[] args){
        Node a = new Node(21);
        Node b = new Node(32);
        Node c = new Node(43);
        Node d = new Node(54);

        a.next = b;
        b.next = c;
        c.next = d;

        // to access data
        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);


    }
}
