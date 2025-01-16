package BitManipulation;

public class BinaryLeftShiftOperator {
    public static void main(String[] args){
        int num = 5;
        int num1 = 8;

        System.out.println(num << num1);

        // iska answer aayega 128 kyuki binary left shift operator ese kam karta he
        // 5 ka binary hota he 101 or vo memory me 000101 ese store hota he
        // Ab isko 2 time left shift karna he to iske left ke 00 hat jayenge
        // or ye ese store hoga 010100 aage jo space bacha usme 0 add ho jayenge
        // ab ye ese calculate hota he 10100 to  20 aayega
        // iska simple formula hota he (a * (2 * b))
    }
}
