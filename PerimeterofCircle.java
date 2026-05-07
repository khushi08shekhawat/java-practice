import java.util.Scanner;
public class PerimeterofCircle {
    public static void main(String[] args){
        Scanner  in = new Scanner(System.in);
        System.out.println("Enter the value of radius");
        double r = in.nextDouble();
        double perimeter = 2*Math.PI*r;
        System.out.println("Perimeter of Circle is " + perimeter);
    }
}