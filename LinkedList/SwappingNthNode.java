package LinkedList;

class Swap{
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

    void swap(){
        Node Slow = head;
        Node Fast = head;

        int i = 1;
        while(i < 2){
            Fast = Fast.next;
            i++;
        }
        Node temp = Fast;
        while(Fast.next != null){
            Slow = Slow.next;
            Fast = Fast.next;
        }
        int temp1 = temp.val;
        temp.val = Slow.val;
        Slow.val = temp1;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

}
public class SwappingNthNode {
    public static void main(String[] args){
        Swap a = new Swap();
        a.Insert(21);
        a.Insert(32);
        a.Insert(43);
        a.Insert(54);
        a.Insert(65);
        a.Insert(76);
        a.swap();
        a.display();
    }
}
