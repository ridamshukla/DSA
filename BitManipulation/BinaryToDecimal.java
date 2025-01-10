package BitManipulation;

public class BinaryToDecimal {
    public static void main(String[] args){
        int num = 10010;

        int store = 0;
        int ans = 1;
        while(num != 0){
            int last = num % 10;
            store += (last * ans);
            ans *= 2;
            num /= 10;
        }

        System.out.println(store);
    }
}
