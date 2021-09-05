//Import the Scanner class
import java.util.Scanner;

class scannerInput
{
    public static void main(String[] args)
    {
        //Declare the object and initialize with
        //predefined standard input object
        Scanner s = new Scanner(System.in);
        
        //String Input
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        //Character Input
        System.out.println("Enter a character: ");
        char c = s.next().charAt(0);

        //Integer Input
        System.out.println("Enter an Integer: ");
        int i = s.nextInt();

        //Float Input
        System.out.println("Enter a Floating Number: ");
        float f = s.nextFloat();

        //Close the Scanner class
        s.close();

        System.out.println("---------------------------------------------------");
        System.out.println("String: " + str);
        System.out.println("Character: " + c);
        System.out.println("Integer: " + i);
        System.out.println("Float: " + f);
    }    
}
