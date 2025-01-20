package LinkedList;

class ll{
    Node head;
    Node tail;
    int size;

    void addAtTail(int data){
        Node temp = new Node(data);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void Length(){
        System.out.println("Size is "+size);
    }
}
public class InsertAtEndMethod {
    public static void main(String[] args){
        ll a = new ll();
        a.addAtTail(21);
        a.addAtTail(32);
        a.display();
        a.Length();
    }
}
