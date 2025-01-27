package LinkedList;

//class Node {
//    int val;
//    Node next;
//
//    Node(int val) {
//        this.val = val;
//        this.next = null;
//    }
//}

class merge {
    Node head;
    Node tail;

    void Insert(int data) {
        Node temp = new Node(data);

        if (head == null) head = tail = temp; // First node
        else {
            tail.next = temp; // Add node at the end
            tail = temp;
        }
    }

    // Merge two sorted linked lists
    Node mergeTwoLists(Node head1, Node head2) {
        Node dummy = new Node(-1); // Dummy node
        Node current = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // Add remaining nodes
        if (head1 != null) current.next = head1;
        if (head2 != null) current.next = head2;

        return dummy.next; // Return merged list (skip dummy)
    }

    void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class MergeTwoSortedList {
    public static void main(String[] args) {
        // First sorted linked list
        merge a = new merge();
        a.Insert(1);
        a.Insert(3);
        a.Insert(5);
        a.Insert(7);
        a.Insert(9);

        // Second sorted linked list
        merge b = new merge();
        b.Insert(2);
        b.Insert(4);
        b.Insert(6);
        b.Insert(8);
        b.Insert(10);

        // Merge the two lists
        merge result = new merge();
        result.head = a.mergeTwoLists(a.head, b.head);

        // Display merged list
        result.Display();
    }
}

