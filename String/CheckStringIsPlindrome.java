package String;

public class CheckStringIsPlindrome {
   public static void main(String[] args){
       String s = "rsrsr";

       boolean check = true;
       int a = 0; int b = s.length()-1;
       while(a <= b){
           if(s.charAt(a) != s.charAt(b)){
               check = false;
           }
           a++;
           b--;
       }

       if(check == true){
           System.out.println("Given String Is Palindrome: ");
       } else{
           System.out.println("Give String Is Not Palindrome: ");
       }
   }
}
