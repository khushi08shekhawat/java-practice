public class MethodOver{
    public static void main (String[] args){
        fun(5);
        //fun("Hello");
    
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}