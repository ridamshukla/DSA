package BitManipulation;

public class Binary1sComplement {
    public static void main(String[] args) {
        int num = 5;

        System.out.println(~5);

        // ans -6 aayega kyuki ye ese kam karta he
        // 5 ka binary hota he 101
        // to vo memory me ese store hota he 00000101 pehle bahutsare zero
        // ab iska 1s complement nikalenge to jaha 1 he use 0 or jaha 0 he vaha 1
        // 11111010 ab iska 2s complement nikalte 2s complement ka matlab hota he pehle 1s complement nikalo fir usme 1 add kar do
        // 00000101 + 1
        // 00000110 1 negative hota he or 0 positive

        // 110 binary ka decimal value 6 hota he or most significant bit apni 1 he to ans
        // aayega -6

    }
}
