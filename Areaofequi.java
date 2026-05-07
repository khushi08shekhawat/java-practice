import java.util.Scanner;
public class Areaofequi {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of side of triangle");
        double a = in.nextDouble();
        double area = (Math.sqrt(3)/4)*a*a;
        System.out.println("Area of equilateral triangle is " + area);

    }
}