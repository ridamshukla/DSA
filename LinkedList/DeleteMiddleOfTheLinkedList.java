package LinkedList;

class Delete{
    Node head;
    Node tail;

    void Insert(int data){
        Node temp = new Node(data);

        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
    }

    void del(){
        Node Slow = head;
        Node Fast = head;

        while(Fast != null && Fast.next != null){
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        Slow.val = Slow.next.val;
        Slow.next = Slow.next.next;
    }

    void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}
public class DeleteMiddleOfTheLinkedList {
    public static void main(String[] args){
        Delete a = new Delete();
        a.Insert(21);
        a.Insert(32);
        a.Insert(43);
        a.Insert(54);
        a.Insert(65);
        a.Insert(76);
        a.del();
        a.Display();
    }
}
