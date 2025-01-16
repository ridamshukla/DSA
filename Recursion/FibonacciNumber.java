package Recursion;

public class FibonacciNumber {
    public static void main(String[] args){
        int num = 5;
        fibonacci(num);
    }
    public static void fibonacci(int num){
        int ans = 0;
        System.out.println("0 1 ");
        if(num == 0){
            return;
        }
        fibonacci(num-1);
    }
}
