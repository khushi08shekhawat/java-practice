import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        long factorial = 1; 
        for( int i= 1; i <= num ; i++){
        factorial *= i;
    }
        System.out.println("Factorial is " + factorial);
    }

}