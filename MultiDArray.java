import java.util.Scanner;
import java.util.Arrays;
public class MultiDArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

    // int[][]arr = new int[3][];
    // int[][] arr2D = {
    //         {1,2,3},
    //         {4,5},
    //         {6,7,8,9}
    // };
    //

    int [][] arr = new int [4][3];
    //System.out.println(arr.length);//no of rows
    // input
    for (int row =0;row<arr.length; row++){
        // for each col in every row
        for (int col = 0; col<arr[row].length; col++){
            arr[row][col]= in.nextInt();

        }
        
    }
    //output
    // for (int row =0;row<arr.length; row++){
    //     // for each col in every row
    //     for (int col = 0; col<arr[row].length; col++){
    //         // we will directly print in this loop
    //         System.out.print(arr[row][col] + " ");
    //     }
    //     System.out.println();

 // to represent in proper matrix form
        // for (int row =0;row<arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));

        // enhanced for loop 
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }  
}

