import java.util.Scanner;
public class Largest {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a first number");
        int a =in.nextInt();
        System.out.println("Enter a seond number");
        int b = in.nextInt();
        int max;
        {
        if(a>b){
            max= a;
        }
        else{
            max=b;
        }
        System.out.println("The largest number is "+ max);
        
       }
    }

    }
