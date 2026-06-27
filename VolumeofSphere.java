import java.util.Scanner;
public class VolumeofSphere{

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of radius"); // Use print instead of println because println return pointer to next line which changes UI 
        double r=in.nextDouble() ,v=(3.14 * 1.33)*Math.pow(r,3); // Math.pow() for this type of problem to enhance efficiency of code and run time 
        System.out.println("Volume of Sphere is " + Math.round(v)); // for eg 3cm it will return double value of (Volume of sphere is 112.75740000000002) but why we need these zeros ? 
        /*
        Make Behavior to write efficient code and understandable to any other too 
        */
    }
}
