import java.util.Scanner;
public class Functions11{
   public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");
        int age = in.nextInt();
        System.out.println("Age of person is :" + Age(age));
   }
        static int Age(int age){
            if(age >= 18){
                System.out.println("Eligible");

            }
            else{
                System.out.println("Ineligible");

            }
            return age;
        }
}