import java.util.Arrays;
public class VarArgs2{
    public static void main(String[]args)
    {
        multiple(2,4,"Khushi","karan");

    }
    static void multiple (int a , int b , String...v){
        System.out.println(Arrays.toString(v));
    }
}