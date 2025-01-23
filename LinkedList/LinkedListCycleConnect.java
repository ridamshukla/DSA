package LinkedList;

class Cycle{
    Node head;
    Node tail;
    int count = 0;

    void insert(int data){
        Node temp = new Node(data);

        if(head == null){
            head = tail = temp;
            count++;
        }
        else{
            tail.next = temp;
            tail = temp;
            count++;
        }

    }

    void connect(){
        int store = count - 2;

        Node temp = head;
        int i = 0;
        while(i < store-1){
            temp = temp.next;
            i++;
        }
        tail.next = temp;
    }




    void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

}
public class LinkedListCycleConnect {
    public static void main(String[] args) {
        Cycle a = new Cycle();
        a.insert(21);
        a.insert(32);
        a.insert(43);
        a.insert(54);
        a.insert(65);
        a.connect();
        a.Display();
    }
}
