package LinkedList;

class Bittu{
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

    void Middle(){
        Node Slow = head;
        Node Fast = head;

        while(Fast != null && Fast.next != null){
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        System.out.println(Slow.val);
    }

}
public class MiddleOfTheLinkedListOptimize {
    public static void main(String[] args){
        Bittu a = new Bittu();
        a.Insert(21);
        a.Insert(32);
        a.Insert(43);
        a.Insert(54);
        a.Insert(65);
        a.Insert(76);
        a.Middle();
    }
}
