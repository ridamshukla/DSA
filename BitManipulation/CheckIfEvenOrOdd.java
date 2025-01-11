package BitManipulation;

public class CheckIfEvenOrOdd {
    public static void main(String[] args){
        int num = 3;
        int bitmask = 1;

        if((num & bitmask) == 0){
            System.out.println("Even Number: ");
        } else{
            System.out.println("Odd Number: ");
        }
    }
}
