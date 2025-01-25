package LinkedList;

class Ro{
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

    void rot(){
        Node Slow = head;
        Node Fast = head;
        int i = 0;
        while(i < 2){
            Fast = Fast.next;
            i++;
        }

        while(Fast.next != null){
            Slow = Slow.next;
            Fast = Fast.next;
        }
        Fast.next = head;
        head = Slow.next;
        Slow.next = null;

    }

    void Display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

    }
}
public class RotateList{
    public static void main(String[] args){
        Ro a = new Ro();
        a.Insert(1);
        a.Insert(2);
        a.Insert(3);
        a.Insert(4);
        a.Insert(5);
        a.Insert(6);
        a.Insert(7);
        a.Insert(8);
        a.rot();
        a.Display();
    }
}
