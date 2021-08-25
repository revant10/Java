public class tryCatch
{
    public static void main(String[] args)
    {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        try
        {
            c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot Divide by Zero (0).");
            System.out.println(e);
        }
    }
}