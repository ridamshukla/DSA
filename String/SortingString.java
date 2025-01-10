package String;

public class SortingString {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("Ridam shukla");

        int i = 97;
        while(i <= 122){
            int j = 0;
            while(j < s.length()){
                if(s.charAt(j) == ' '){
                    j++;
                }
                int a = (i-32);
                char ch = (char)i;
                char ch1 = (char)a;
                if(s.charAt(j) == ch){
                    System.out.print(ch);
                } else if(s.charAt(j) == ch1){
                    System.out.print(ch1);
                }
                j++;
            }
            i++;
        }
    }
}
