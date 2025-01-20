package LinkedList;

class ll2{
    Node head;
    Node tail;

    void addAttail(int data){
        Node temp = new Node(data);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
    }

    void addAtAnyIndex(int data,int index){
        Node temp = new Node(data);

        Node Local = head;
        int i = 0;
        while(i < index-2){
            Local = Local.next;
            i++;
        }
        temp.next = Local.next;
        Local.next = temp;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }


    }
}
public class InsertAtAnyIndex {
    public static void main(String[] args){
        ll2 a = new ll2();
        a.addAttail(21);
        a.addAttail(32);
        a.addAttail(43);
        a.addAttail(54);
        a.addAttail(65);

        a.display();
        a.addAtAnyIndex(90,3);

        System.out.println();
        a.display();
    }
}
