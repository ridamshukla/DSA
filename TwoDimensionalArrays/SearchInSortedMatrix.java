package TwoDimensionalArrays;

public class SearchInSortedMatrix {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        // code

        boolean check = false;
        int target = 24;
        int i = 0; int j = arr[i].length-1;
        while(j >= 0 && i < arr.length){
            if(arr[i][j] == target){
                check = true;
                break;
            } else if(target < arr[i][j]){
                j--;
            } else{
                i++;
            }
        }

        if(check == true){
            System.out.println("yes Traget is present: ");
        } else{
            System.out.println("No taregt is not present: ");
        }
    }
}
