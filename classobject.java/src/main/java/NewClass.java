
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter float :");
        float myFloat = input.nextFloat();
        System.out.println("float entered = " + myFloat);
        
        System.out.print("Enter double :");
        double myDouble = input.nextDouble();
        System.out.println("double entered = " + myDouble);
        
        System.out.print("My text : ");
        String mystring = input.next();
        System.out.println("MY text = " + mystring);
    }
}
