import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(12);
        // list.add(45);
        // list.add(65);
        // list.add(76);
        // list.add(87);
        // list.add(17);
        // list.add(65);
        // list.add(87);
        // list.add(55);
        // list.add(44);
        // list.add(77);
        // list.add(24);
        // list.add(55);
        // System.out.println(list);

        //true or false
        //System.out.println(list.contains(4567));

        // update the array
        // list.set(0,567);
        // System.out.println(list);

        // //remove the 2nd index
        // list.remove(2);
        // System.out.println(list);

        //input or iterate the elements

        for(int i = 0; i<5; i++){
            list.add(in.nextInt());
        
        }
        // get an item at any index
        for(int i = 0;i < 5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);//pass index here, list[index] syntax will not work here
    }
}