package LinkedList;

class Remove{
    Node head;
    Node tail;

    void Insert(int data){
        Node temp = new Node(data);

        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
    }


    void Rem(){
        Node Slow = head;
        Node Fast = head;
        int i = 1;
        while(i <= 2){
            Fast = Fast.next;
            i++;
        }
        if(Fast == null){
            head = head.next;
        }
        while(Fast.next != null){
            Slow = Slow.next;
            Fast = Fast.next;
        }
        Slow.next = Slow.next.next;
    }


    void Display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

}
public class RemoveNthNodeOfLinkedList {
    public static void main(String[] args){
        Remove a = new Remove();
        a.Insert(21);
        a.Insert(32);
        a.Insert(43);
        a.Insert(54);
        a.Insert(65);
        a.Insert(76);
        a.Rem();
        a.Display();
    }
}
