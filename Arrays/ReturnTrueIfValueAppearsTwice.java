package Arrays;

public class ReturnTrueIfValueAppearsTwice {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,1,5,6};
        boolean check = false;

        int count = 0;
        int i = 0;
        while(i < arr.length){
            int j = i+1;
            while(j < arr.length){
                if(arr[i] == arr[j]){
                    check = true;
                    count = arr[i];
                    break;
                }
                j++;
            }
            i++;
        }

        if(check == true){
            System.out.println("Yes Value "+count+" appears twice: ");
        } else{
            System.out.println("every Value Has Distinct: ");
        }
    }
}
