package LinkedList;

class r{
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

    void Remove(){
        Node temp = head;
        while(temp.next != null && temp != null){
            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else{
                temp = temp.next;
            }
        }
    }

    void Display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
public class RemoveDuplicateFromSortedList {
    public static void main(String[] args){
        r a = new r();
        a.Insert(1);
        a.Insert(1);
        a.Insert(2);
        a.Insert(2);
        a.Insert(3);
        a.Insert(4);
        a.Insert(5);
        a.Insert(6);
        a.Remove();
        a.Display();
    }
}
