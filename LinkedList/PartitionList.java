package LinkedList;

class LinkedList {
    Node head;

    // Insert a new node at the end of the list
    void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Partition the list around a value x
    Node partition(int x) {
        Node smallerHead = null, smallerTail = null; // For nodes < x
        Node greaterHead = null, greaterTail = null; // For nodes >= x

        Node current = head;

        while (current != null) {
            if (current.val < x) {
                // Add to the smaller list
                if (smallerHead == null) {
                    smallerHead = smallerTail = current;
                } else {
                    smallerTail.next = current;
                    smallerTail = current;
                }
            } else {
                // Add to the greater list
                if (greaterHead == null) {
                    greaterHead = greaterTail = current;
                } else {
                    greaterTail.next = current;
                    greaterTail = current;
                }
            }
            current = current.next;
        }

        // If there are no smaller elements, return greater list
        if (smallerHead == null) {
            return greaterHead;
        }

        // Merge the two lists
        smallerTail.next = greaterHead;

        // Ensure the last node of the greater list points to null
        if (greaterTail != null) {
            greaterTail.next = null;
        }

        return smallerHead;
    }

    // Print the linked list
    void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class PartitionList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(5);
        list.insert(2);

        System.out.println("Original List:");
        list.display(list.head);

        int pivot = 3;
        Node partitionedHead = list.partition(pivot);

        System.out.println("Partitioned List around pivot " + pivot + ":");
        list.display(partitionedHead);
    }
}



