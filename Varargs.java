import java.util.Arrays;
public class Varargs{
    public static void main (String[]args)
    {
        fun(45,25,64,76,25,7,54,3,34,8);

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
        }
    }