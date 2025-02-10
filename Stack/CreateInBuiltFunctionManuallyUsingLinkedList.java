package Stack;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class st{
    Node top;

    void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
    }

    int pop(){
        if(isempty()){
            System.out.print("Stack Is Empty: ");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    int peek(){
        if(isempty()){
            System.out.print("Stack Is Empty: ");
            return -1;
        }
        return top.data;
    }

    boolean isempty(){
        return top == null;
    }

    public void display() {
        if (isempty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class CreateInBuiltFunctionManuallyUsingLinkedList {
    public static void main(String[] args){
        st stack = new st();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); // Stack: 30 -> 20 -> 10 -> null

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.display(); // Stack: 20 -> 10 -> null

        System.out.println("Is stack empty? " + stack.isempty());
    }

}
