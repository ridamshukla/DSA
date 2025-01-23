package LinkedList;

class Find{
    Node head;
    Node tail;
    int count;

    void insert(int data){
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
        int store = count - 2;

        Node temp = head;
        int i = 0;
        while(i < store-1){
            temp = temp.next;
            i++;
        }
        tail.next = temp;
    }

    void check(){
        Node Slow = head;
        Node Fast = head;
        boolean check = false;
        while(Fast != null && Fast.next != null){
            Slow = Slow.next;
            Fast = Fast.next.next;
            if(Slow == Fast){
                check = true;
                break;
            }
        }
        if(check == true){
            System.out.print("yes cycle is present: ");
        } else{
            System.out.println("No Cycle IS Not Present: ");
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

public class FindLinkedListCycle {
    public static void main(String[] args){
        Find a = new Find();
        a.insert(21);
        a.insert(32);
        a.insert(43);
        a.insert(54);
        a.insert(65);
        a.connect();
        a.check();

    }
}
