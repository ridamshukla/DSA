package String;

public class ShotestPathToReachDirection {
    public static void main(String[] args){
        String s = "WNEENESENNN";
        int x = 0;
        int y =  0;

        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch == 'S'){
                y--;
            } else if(ch == 'E'){
                x++;
            } else if(ch == 'W'){
                x--;
            } else if(ch == 'N'){
                y++;
            }
            i++;
        }

        int formula = ((x-0)*x) + ((y-0)*y);
        int ans = 0;

        int a = 1;
        while(a < formula/2){
            if(a * a == formula){
                ans = a;
            }
            a++;
        }

        System.out.println(ans);


    }
}
