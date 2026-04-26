import java.util.Scanner;
public class Perimeter{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the value of a");
        float a = in.nextFloat();
        System.out.println("Enter the value of b");
        float b = in.nextFloat();
        float perimeter = 2*(a+b);
        System.out.println("Perimeter of parallelogram " + perimeter);

    }
}