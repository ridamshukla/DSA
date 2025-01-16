package Recursion;

public class PrintDecreasingOrder {
    public static void main(String[] args){
        int num = 10;
        PrintDecreasingorder(num);
    }
    public static void PrintDecreasingorder(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        PrintDecreasingorder(num-1);
    }
}
