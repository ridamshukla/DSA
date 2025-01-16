package BitManipulation;

public class UpdateIthBit {
    public static void main(String[] args){
        int num = 10;
        int Updateposition = 2;
        int bitmask = 1;

        if(bitmask == 1){
            int num1 = (bitmask << Updateposition);
            int ans = (num | num1);
            System.out.println(ans);
        } else{
            int num1 = (1 << Updateposition);
            int num2 = (~num1);
            int ans = (num & num2);
            System.out.println(ans);
        }

    }
}
