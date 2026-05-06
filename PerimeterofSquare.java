import java.util.Scanner;
public class PerimeterofSquare{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        float a = in.nextFloat();
        float perimeter = 4*a;
        System.out.println("Perimeter of square is " + perimeter);
    }
}