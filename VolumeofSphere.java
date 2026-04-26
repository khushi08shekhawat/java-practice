import java.util.Scanner;
public class VolumeofSphere{

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of radius");
        double r =in.nextDouble();
        double v = 3.14 * 1.33*r*r*r;
        System.out.println("Volume of Sphere is " + v);
    }
}