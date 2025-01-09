package String;

public class LoweCaseToUpperCaseByUsingStringBuilder {
    public static void main(String[] args){
        String s = "ridam shukla";
        StringBuilder r = new StringBuilder();

        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == ' '){
                r.append(' ');
            }
            int ch = s.charAt(i);
            if(ch >= 65 && ch <= 90){
                ch += 32;
                char ch1 = (char)ch;
                r.append(ch1);
            } else if(ch >= 97 && ch <= 122){
                ch -= 32;
                char ch1 = (char)ch;
                r.append(ch1);
            }
            i++;
        }
        System.out.println(r);
    }
}
