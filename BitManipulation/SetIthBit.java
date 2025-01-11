package BitManipulation;

public class SetIthBit {
    public static void main(String[] args){
        int num = 10;
        int set = 2;
        int bitmask = 1<<set;

         num = num | bitmask;
        System.out.println(num);


    }
}
