package LinkedList;

class ll4{
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

    void set(int data,int index){
        Node temp = head;
        if(head == null) tail.val = data;
        else{
            int i = 0;
            while(i < index){
                temp = temp.next;
                i++;
            }
            temp.val = data;
        }
    }
}
public class SetValueAtAnyIndex {
    public static void main(String[] args){
        ll4 a = new ll4();
        a.addAttail(21);
        a.addAttail(32);
        a.addAttail(43);
        a.addAttail(54);
        a.addAttail(65);
        a.set(90,3);
        a.display();
    }
}
