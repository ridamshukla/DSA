package String;

public class ReverseEachWord {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("Ridam shukla is brahman he");



        int i = 0; int a = 0; int b = 0;
        while(i < s.length()) {
            if (s.charAt(i) == ' ' || i == s.length()-1) {
                while (a <= b) {
                    char ch = s.charAt(a);
                    char ch1 = s.charAt(b);
                    s.setCharAt(a,ch1);
                    s.setCharAt(b,ch);
                    a++;
                    b--;
                }
                a = i+1;
            }
            i++;
            if(i == s.length()-1){
                b = i;
            } else {
                b = i - 1;
            }
        }
        System.out.println(s);
    }
}
