package BitManipulation;

public class BinaryOrOperator {
    public static void main(String[] args){
        int num = 5; int num1 = 6;

        System.out.println(num | num1);

        //  answer 7 aayega kyuki sabse pehle 5 ka binary niklega fir 6 ka binary niklega
        // fir inko calculate kiya jayega
        // or operator jo hota he vo ese kam karta he:

        // 0 | 1 = 1
        // 0 | 0 = 0
        // 1 | 1 = 1
        // 1 | 0 = 1

        // dekho 5 ka binary hota he 101 or 6 ka 110
        // ab calculate karte he

        // 1 0 1
        // 1 1 0
        // ans   1 1 1

        //  ans 111 aaya jo decimal me 7 hota he
    }
}
