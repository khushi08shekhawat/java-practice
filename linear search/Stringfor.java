import java.util.Arrays;
public class Stringfor{
    public static void main(String[]args){
        String name ="Khushi";
        char target = 'u';
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str,char target){
        if (str.length() == 0){
            return false;
        }
            for(char ch: str.toCharArray()){
                if(ch == target){
                    return true;
            }
       }

            return false;
        }
}