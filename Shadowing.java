public class Shadowing{
    static int x = 90; //this will be shadowed at
    public static void main (String [] args){
        System.out.println(x);//90
        int x = 40;// the class var at line 2 is shadowed by this
        //int x ; is declaration
        // System.out.prinln(x);scope will begin when the value is initialised
        // x = 40; is initialisation
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println((x));
    
    }
    }
