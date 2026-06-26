import java.util.Scanner;
public class Functions10{
        public static void main( String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        System.out.println("Factorial of number is :" + Factorial(n));
    
    
     }
        static long Factorial(int n){
            long factorial =1;
            for(int i =1; i<=n ; i++){
                factorial *= i;
            }
            return factorial;

        }



}