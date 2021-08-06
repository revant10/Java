// Import Scanner class
import java.util.Scanner;

class c2
{
    c2(String name)
    {
        System.out.println("Hello " + name);
        System.out.println("This method was invoked as soon as object is initialized.");
    }
}

class constructor2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.next();
        c2 c = new c2(name);

        // Close Scanner
        scan.close();
    }
}
