package LinkedList;

class ll3 {
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

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    void getElement(int element){
        Node temp = head;
        int i = 0;
        while(i < element){
            temp = temp.next;
            i++;
        }
        System.out.print(temp.val);
    }
}
public class GetElementAtAnyIndex {
    public static void main(String[] args){
        ll3 a = new ll3();
        a.addAttail(21);
        a.addAttail(32);
        a.addAttail(43);
        a.addAttail(54);
        a.addAttail(65);
        a.getElement(3);

    }
}
