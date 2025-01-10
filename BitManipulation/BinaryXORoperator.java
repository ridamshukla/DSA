package BitManipulation;

public class BinaryXORoperator {
    public static void main(String[] args){
        int num = 5; int num1 = 6;

        System.out.println(num ^ num1);

        //  answer 3 aayega kyuki sabse pehle 5 ka binary niklega fir 6 ka binary niklega
        // fir inko calculate kiya jayega
        // xor operator jo hota he vo ese kam karta he:

        // 0 ^ 1 = 1
        // 0 ^ 0 = 0
        // 1 ^ 1 = 0
        // 1 ^ 0 = 1

        // different me 1 deta he or same me 0

        // dekho 5 ka binary hota he 101 or 6 ka 110
        // ab calculate karte he

        // 1 0 1
        // 1 1 0
        // ans   0 1 1

        //  ans 011 aaya jo decimal me 3 hota he
    }
}
