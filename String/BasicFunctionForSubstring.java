package String;

public class BasicFunctionForSubstring {
    public static void main(String[] args){
        String s = "Ridam Shukla";
        String sub = "";

        int Start = 2;
        int End = 6;

        while(Start <= End){
            sub += s.charAt(Start);
            Start++;
        }

        System.out.println(sub);


    }
}
