package LinkedList;

class ll5{
    Node head;
    Node tail;

    void addAttail(int data) {
        Node temp = new Node(data);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
    }

    void delete(int index){
        Node temp = head;

        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        if(temp.next == tail) tail = temp;
        temp.next = temp.next.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
public class DeleteAtAnyIndex {
    public static void main(String[] args){
        ll5 a = new ll5();
        a.addAttail(21);
        a.addAttail(32);
        a.addAttail(43);
        a.addAttail(54);
        a.addAttail(65);
        a.delete(3);
        a.display();
    }
}
