package Arrays;
import java.util.*;

public class LastOccurenceOfNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(List.of(2,3,4,6,8,23,5,7,2,1,2));
        int x = 2;
        int count = 0;
        int i = 0;
        while(i < arr.size()){
            if(arr.get(i) == x){
                count = i;
            }
            i++;
        }
        System.out.println("Last Occurence Of X Is : "+count);

    }
}
