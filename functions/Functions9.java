import java.util.Scanner;
public class Functions9{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = in.nextDouble();
        
        System.out.println("Area of circle is :" + Area(radius));
    }

    static double Area(double r){

        double area = 3.14*r*r;

        return area;
    }
}