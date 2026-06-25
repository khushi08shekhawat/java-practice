import java.util.Scanner;
public class Enhancedswitch{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit name:");
        String fruit = in.next();

        /*switch(fruit){ ENHANCED SWITCH

            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Banana" -> System.out.println("A yellow fruit");
            default -> System.out.println("Enter a valid fruit name");
        }//*/
    
        switch (fruit) {
    case "Mango":
        System.out.println("King of fruits");
        break;

    case "Apple":
        System.out.println("A sweet red fruit");
        break;

    case "Banana":
        System.out.println("A yellow fruit");
        break;

    default:
        System.out.println("Enter a valid fruit name");
}
    }
}

