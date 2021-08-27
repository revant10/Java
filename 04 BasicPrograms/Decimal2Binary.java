// Importing Scanner class
import java.util.Scanner;


// User-defined
class Binary
{
    Binary(int n)
    {
        if (n == 0)
        {
            System.out.println();
            System.out.println("Using user-defined method");
            System.out.println(String.format("Binary: %04d", 0));
        }
        else
        {
            int r, b = 0, p = 1;

            while (n != 0)
            {
                r = n % 2;
                b = b + (r * p);
                n = n / 2;
                p = p * 10;
            }
            
            System.out.println();
            System.out.println("Using user-defined method");
            System.out.println(String.format("Binary: %04d", b));
        }
    }
}

public class Decimal2Binary
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("|----- Decimal to Binary Converter -----|");
        System.out.print("Enter a number to Convert: ");
        int n = scan.nextInt();

        // Using User-defined Method
        Binary b = new Binary(n);

        // Using Built-in Method
        System.out.println();
        System.out.println("Using in-built method");
        System.out.println("Binary: " + Integer.toBinaryString(n));
        
        // Close scanner
        scan.close();
    }
}