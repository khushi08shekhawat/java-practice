import java.util.Scanner;
public class AreaofRhombus{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of d1");
        double d1 = in.nextDouble();
        System.out.println("Enter the value of d2");
        double d2 = in.nextDouble();
        double area = (d1 * d2) / 2;
        System.out.println("Area of rhombus is " + area);
        }
}