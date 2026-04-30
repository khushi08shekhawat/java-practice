import java.util.Scanner;
public class EnhancedForLoop{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
    
        int[]arr = new int[5];
        arr[0]= 45;
        arr[1]= 34;
        arr[2]= 57;
        arr[3]= 54;
        arr[4]= 91;
        for (int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

    //     for (int i = 0; i< arr.length;i++)
    //     {

    //     System.out.print(arr[i] + " ");
    // }
    // enhanced for loop(for each)
    for(int num : arr){// for every element in the array print the element
        System.out.print(num + " ");//here num represents the element of an array
    }
    }
}