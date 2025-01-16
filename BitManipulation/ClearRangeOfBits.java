package BitManipulation;

public class ClearRangeOfBits {
    public static void main(String[] args){
        int num = 43;
        int bitmask = 1;
        int num1 = (bitmask << 5);
        int ans = (num & num1);
        System.out.println(ans);
    }
}
