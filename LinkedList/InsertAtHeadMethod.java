package LinkedList;

class ll1{
    Node head;
    Node tail;

    void addAtHead(int data){
        Node temp = new Node(data);

        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            temp = head;
            System.out.println(temp.val);
        }
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}
public class InsertAtHeadMethod {
    public static void main(String[] args){
       ll1 a = new ll1();
       a.addAtHead(1);
       a.addAtHead(21);
       a.addAtHead(43);
       a.addAtHead(54);
       a.display();

    }
}
