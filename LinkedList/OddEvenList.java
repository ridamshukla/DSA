package LinkedList;


class oe {
    Node head;
    Node tail;

    void insert(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    Node oddeven() {
        if (head == null || head.next == null) return head; // Edge case handling

        Node oddHead = new Node(-1);
        Node evenHead = new Node(-1);
        Node oddTail = oddHead;
        Node evenTail = evenHead;

        Node temp = head;
        int i = 1;

        while (temp != null) {
            if (i % 2 != 0) { // Odd index
                oddTail.next = temp;
                oddTail = temp;
            } else { // Even index
                evenTail.next = temp;
                evenTail = temp;
            }
            temp = temp.next;
            i++;
        }

        evenTail.next = null; // To prevent cycle
        oddTail.next = evenHead.next; // Connect odd list to even list

        return oddHead.next;
    }

    void Display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class OddEvenList {
    public static void main(String[] args) {
        oe a = new oe();
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        Node result = a.oddeven();
        a.Display(result);
    }
}
