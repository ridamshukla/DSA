package BitManipulation;

public class DecimalToBinary {
    public static void main(String[] args){
        int num = 18;

        int ans = 1;
        int ans1 = 0;
        while(num != 0){
            int last = num % 2;
            ans1 += (last*ans);
            num /= 2;
            ans *= 10;
        }

        System.out.println(ans1);
    }
}
