package BitManipulation;

public class ClearIthBit {
    public static void main(String[] args){
        int num = 10;
        int bitmask = 1;
        int num1 = (bitmask << 1);
        int num3 = (~num1);
        int num2 = (num & num3);

        System.out.println(num2);

        // dekho 10 ka binary hota he 1010 or apnko 1 position clear karni he matlab usko
        // 0 banana he to apn sabse pehle bitmask lenge 1 or usko jis position ko change karna he
        // vaha tak left shift karenge fir apn uska not karenge by using tild operator fir uska
        // and karenge original number ke sath to apni ith position clear ho jayegi


    }
}
