import java.util.Scanner;
public class Functions5{
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = in.nextInt();
    System.out.println("Number is : " + EvenOdd(n));
    }

    static String EvenOdd(int n){
        if(n % 2 ==0){
            return "Even";
        }
        else{
           
        return "Odd";
    }
}
}