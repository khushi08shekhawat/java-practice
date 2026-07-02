import java.util.Arrays;
public class Search2DMax{
    public static void main(String[]args){
    int[][]arr = {{18,12,-7,3,14,28},
    {12,14,17,22,25,28},
    {11,13,15,17,19,21}
    };
    int target = 17;
    int[] ans = search(arr,target);
    System.out.println(Arrays.toString(ans));
    System.out.println(Max(arr));
}
    static int[] search(int[][] arr, int target) {
    for(int row =0; row <arr.length; row++){
        for(int col =0; col< arr[row].length; col++){
            if(arr[row][col]== target){
                return new int[]{row, col};
            }
        }
    }
            return new int[]{-1, -1};   
}   
static int Max(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for(int row =0; row <arr.length; row++){
        for(int col =0; col< arr[row].length; col++){
            if(arr[row][col]> max){
                max = arr[row][col];
            }
        }
    }
            return max;

}
}
