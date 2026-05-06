import java.util.Scanner;
public class VolumeofCylinder{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        double r = in.nextDouble();
        System.out.println("Enter the value of height");
        double h = in.nextDouble();
        double volume = Math.PI*r*r*h;
        System.out.println("Volume of cylinder is " + volume);
    }
}