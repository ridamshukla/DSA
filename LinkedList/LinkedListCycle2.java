package LinkedList;

class Cycle2{
    Node head;
    Node tail;
    int count;

    void Insert(int data){
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

    void connect(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        int length = count-3;
        Node temp1 = head;
        int i = 0;
        while(i < length){
            temp1 = temp1.next;
            i++;
        }
        temp.next = temp1;
    }

    void FindCycleAndReturnNode(){
        Node Slow = head;
        Node Fast = head;
        Node temp = head;
        while(Fast != null && Fast.next != null){
            if(head == null || head.next == null) break;

            Slow = Slow.next;
            Fast = Fast.next.next;
            if(Slow == Fast){
                break;
            }
        }
        while(temp != null){
            if(temp == Slow){
                System.out.print(temp.val+" ");
                break;
            }
            temp = temp.next;
            Slow = Slow.next;
        }

    }


    void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

}
public class LinkedListCycle2 {
    public static void main(String[] args){
        Cycle2 a = new Cycle2();
        a.Insert(21);
        a.Insert(32);
        a.Insert(43);
        a.Insert(54);
        a.Insert(65);
        a.connect();
        a.FindCycleAndReturnNode();

    }
}
