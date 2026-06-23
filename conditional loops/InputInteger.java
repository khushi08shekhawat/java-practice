import java.util.Scanner;
public class InputInteger{
    public static void main(String[]args){
     Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");

     int num = in.nextInt();
     int max=num;
     while(num!=0){
        if(num > max){
        max = num;
        }
        num = in.nextInt();
        }
        System.out.println("The largest number is "+ max);
     }
    }
