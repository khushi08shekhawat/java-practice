import java.util.Arrays;
import java.util.Scanner;
public class Multi2DArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [][] arr  = new int[3][2];
        
       /* int [][] arr2D = {{1,2,3,4,5},
                           {6,7},
                           {8,9,10}  };*/

        System.out.println(arr.length);
        //input
        for(int row = 0; row < arr.length; row++ ){
            for (int col = 0; col< arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));


        }
}