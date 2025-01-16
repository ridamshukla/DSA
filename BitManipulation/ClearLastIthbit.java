package BitManipulation;

public class ClearLastIthbit {
    public static void main(String[] args){
        int num = 14;
        int pos = 2;
        int num1 = (~0 << pos);
        int ans = (num & num1);

        System.out.println(ans);
    }
}
