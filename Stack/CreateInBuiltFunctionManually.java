package Stack;

class Stack{
    int[] arr;
    int size;
    int top;

    Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }
    void push(int data){
        if(top == size-1){
            System.out.println("Stack is OverFlow: ");
            return;
        }
        arr[++top] = data;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack is underFlow: ");
        }
        return arr[top--];
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack Is Empty: ");
        }
        return arr[top];
    }

    boolean IsEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    void printStack(){
        if(top == -1){
            System.out.println("Stack Is Empty: ");
            return;
        }
        int i = 0;
        while(i <= top){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}
public class CreateInBuiltFunctionManually {
    public static void main(String[] args){
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.pop();
        s.printStack();


    }
}
