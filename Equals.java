import java.util.Scanner;
public class Equals {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        String fruit= in.next();

        /*if(fruit.equals("mango"));
        System.out.println("King of fruits");
        if(fruit.equals("apple"));
        System.out.println("Sweet red fruit ");
 */ // to not repeat this syntax we will use switch case


       /*switch(fruit){
        case "Mango":
        System.out.println("King of fruits");
        break;
        case "Apple":
            System.out.println("Sweet red fruit");
            break;
        case "Orange":
            System.out.println("Round fruit");
            break;
        default:
            System.out.println("Please enter a vaild fruit");/* */
        //enhanced version of switch
        switch(fruit){
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Sweet red fruit");
            case "Grape" -> System.out.println("Purple or green fruit");
            case "Orange"-> System.out.println("Round fruit");
            default -> System.out.println("Please enter a fruit name");

        }

       }
    }

