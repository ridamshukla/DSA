package String;

public class LowerCaseToUpperCase {
    public static void main(String[] args){
        String s = "ridam shukla";
        String r = "";

        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == ' '){
                r += ' ';
            }
            int ch = s.charAt(i);
            if(ch >= 65 && ch <= 90){
                ch += 32;
                char ch1 = (char)ch;
                r += ch1;
            } else if(ch >= 97 && ch <= 122){
                ch -= 32;
                char ch1 = (char)ch;
                r += ch1;
            }
            i++;
        }

        System.out.println(r);

    }
}
