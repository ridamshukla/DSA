package LinkedList;

public class DisplayLinkedList {
    public static void main(String[] args){
        Node a = new Node(21);
        Node b = new Node(32);
        Node c = new Node(43);
        Node d = new Node(54);

        a.next = b;
        b.next = c;
        c.next = d;

        Node temp = a;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

}
