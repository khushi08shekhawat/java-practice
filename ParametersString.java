public class ParametersString{
    public static void main (String [] args){
        String personalised = greetings("Khushi");
        System.out.println(personalised);//""this will not come as it will be 
        // treated as text not the variable and we want personalised as variable 

    }
    static String greetings (String name) {

    return "Hello" + name;
}
}