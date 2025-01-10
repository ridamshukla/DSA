package String;

public class ReverseString {
    public static void main(String[] args){
        String s = "Ridam";
        StringBuilder r = new StringBuilder();

        int b = s.length()-1;
        while(b >= 0){
            char ch1 = s.charAt(b);
            r.append(ch1);
            b--;
        }
        System.out.println(r);
    }
}
