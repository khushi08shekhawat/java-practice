import java.util.Scanner;
public class Simple{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the value of principle");
        int p = in.nextInt();
        System.out.println("Enter the value of rate");
        int r = in.nextInt();
        System.out.println("Enter the value time ");
        int t = in.nextInt();
        int s = (p*r*t)/100 ;
        System.out.println("The value of simple interest is " +s );
        
    }
}