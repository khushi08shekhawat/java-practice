import java.util.Scanner;
public class AreaOfIsosTriangle{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of base");
        double base = in.nextDouble();
        System.out.println("Enter the value of height");
        double height = in.nextDouble();
        double area = (0.5*base*height);
        System.out.println("Area Of Isos Triangle " + area);
    }
} 
