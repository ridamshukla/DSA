package LinkedList;

class r1{
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
        Node temp1 = head;
        while(temp1.next != null && temp1 != null){
           if(temp.val == temp1.val){
               temp1 = temp1.next;
           } else{
               temp.next = temp1;
               temp = temp1;
           }
        }
        temp.next = null;
    }

    void Display(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
public class RemoveDuplicateSortedListMethod2nd {
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
