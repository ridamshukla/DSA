package String;

public class StringCompression {
    public static void main(String[] args){
        String s = "aaabbcccccddd";

        int i = 0;
        while(i < s.length()){
            int count = 1;
            int ch2 = s.charAt(i);
            char ch = (char)ch2;
            int j = i+1;
            while(j < s.length()){
                char ch1 = s.charAt(j);
                if(ch == ch1){
                    count++;
                }
                j++;
            }
            System.out.print(s.charAt(i)+""+count);
            i += count;
        }
    }
}
