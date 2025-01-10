package String;

public class ValidAnagram {
    public static void main(String[] args){
        String s = "anagram";
        String r = "nagaram";
        boolean check = true;

        // thraugh string

        int i = 97;
        while(i <= 122){
            int j = 0; int count = 0; int count1 = 0;
            while(j < s.length()){
                char ch = (char)i;
                int a = (i-32);
                char ch1 = (char)a;
                if(s.charAt(j) == ch || s.charAt(j) == a){
                    count++;
                } if(r.charAt(j) == ch || r.charAt(j) == a){
                    count1++;
                }
                j++;
            }
            if(count != count1){
                check = false;
            }
            i++;
        }

        if(check == true){
            System.out.println("yes given string is anagram: ");
        } else{
            System.out.println("no givem string is not anagram: ");
        }
    }
}
