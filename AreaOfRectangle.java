import java.util.Scanner;
public class AreaOfRectangle{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of length");
        float length = in.nextFloat();
        System.out.println("Enter the value of breadth");
        float breadth = in.nextFloat();
        float area = (length*breadth);

        System.out.println("Area od Rectangle is " + area);

    }
}