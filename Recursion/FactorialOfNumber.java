package Recursion;

public class FactorialOfNumber {
    public static void main(String[] args){
        int num = 5;
        int factorial = Fact(num);
        System.out.println(factorial);
    }
    public static int Fact(int num){
        int fact = 1;
        if(num == 0){
            return 1;
        }
        Fact(num-1);
        fact =  num * Fact(num-1);
        return fact;
    }
}
