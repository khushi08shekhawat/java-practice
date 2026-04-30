import java.util.Scanner;
import java.util.Arrays;
public class ToString{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
    
        int[]arr = new int[5];
        arr[0]= 45;
        arr[1]= 34;
        arr[2]= 57;
        arr[3]= 54;
        arr[4]= 91;
    
    //array of objects
    String [] str = new String[4];
    for(int i = 0; i< str.length; i++){
        str[i] = in.next();
    }
    // System.out.println(Arrays.toString(str));
    // modify 
    str [1]= "KHUSHI";
    System.out.println(Arrays.toString(str));

        }
    }
