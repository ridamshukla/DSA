package LinkedList;


public class BasicLinkedList {
    public static class Node{
        int data;
        Node next;

         Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public static Node Head;
    public static Node Tail;

    public static void main(String[] args){
        BasicLinkedList ll = new BasicLinkedList();
        ll.Head = new Node(21);
        ll.Head.next = new Node(32);
        System.out.println(ll.Head.next);
        System.out.println(ll.Head);

    }
}
