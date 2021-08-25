// Import Scanner class
import java.util.Scanner;

class demo
{
    int divide(int x, int y) throws ArithmeticException
    {
        return (x / y);
    }
}

public class throwS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("First Number: ");
        int a = scan.nextInt();
        System.out.print("Second Number: ");
        int b = scan.nextInt();

        demo d = new demo();

        try
        {
            int c = d.divide(a, b);
            System.out.println("Result: " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
            System.out.println(e);
        }

        scan.close();
        }
}