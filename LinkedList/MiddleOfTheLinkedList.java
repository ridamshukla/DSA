package LinkedList;

class Middle{
    Node head;
    Node tail;
    int count;

    void InsertAtTail(int data){
        Node temp = new Node(data);

        if(head == null) {
            head = tail = temp;
            count++;
        }
        else{
            tail.next = temp;
            tail = temp;
            count++;
        }
    }

    void MiddleOfLL(){
        int length;
        if(count % 2 != 0){
             length = (count / 2);
        } else{
             length = (count / 2);
        }

        Node temp = head;
        int i = 0;
        while(i < length){
            temp = temp.next;
            i++;
        }
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
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
public class MiddleOfTheLinkedList {
    public static void main(String[] args){
        Middle a = new Middle();
        a.InsertAtTail(21);
        a.InsertAtTail(32);
        a.InsertAtTail(43);
        a.InsertAtTail(54);
        a.InsertAtTail(65);
        a.InsertAtTail(76);
        a.MiddleOfLL();
    }
}
