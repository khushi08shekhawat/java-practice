import java.util.Arrays;
public class ShuffleArray {
    public static void main(String[]args){
        int[] arr={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr)));
    }
    static int[] shuffle(int arr[]){
        int n = arr.length/2;
        int i =0;
        int j =n;
        int k =0;
               int[] nums=new int[2*n];

        while(i<n){
            nums[k]=arr[i];
            k++;
            nums[k]=arr[j];
            k++;

            i++;
            j++;
        }
        return nums;
    }







}
