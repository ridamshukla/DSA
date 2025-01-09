package String;

public class PrintTheLargestString {
    public static void main(String[] args){
        String s = "aaabss";
        String r = "aaabcc";
        String rs = "aaabccd";

        int count =  0;
        int i = 0;
        while(i < s.length()){
            int ch = s.charAt(i);
            int ch1 = r.charAt(i);
            if(ch > ch1){
                count++;
                break;
            }
            i++;
        }

        int count1 =  0;
        int i1 = 0;
        while(i1 < r.length()){
            int ch = r.charAt(i1);
            int ch1 = rs.charAt(i1);
            if(ch > ch1){
                count1++;
                break;
            }
            i1++;
        }


    }
}
