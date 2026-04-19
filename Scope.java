public class Scope{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            //int a =56; // This will cause an error because 'a' is already
            // defined in the outer scope
            a = 100;//reassign the origin ref variable to some other value 
            System.out.println("a");
            int c  = 67;
// values initialised in this block will remain in the same block
        }
        System.out.println(a);
        //System.out.println(c); // cannot use outside the block
}
}
/*/// scoping in for loops
for (int i = 0; i ‹ 4; i++) { System.out.println(i);
int num = 90;
int a = 10;/* 