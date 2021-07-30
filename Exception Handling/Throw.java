// Import Scanner
import java.util.Scanner;

// Creating our own Exception
class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

class Demo
{
    void validate(int age)
    {
        try
        {
            if(age < 18)
            {
                throw new  MyException("Under Age");
            }
            else
            {
                System.out.println("Valid");
                System.out.println("Proceed Ahead");
            }
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

public class Throw 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Demo d = new Demo();
        System.out.print("Enter your Age: ");
        int a = scan.nextInt();
        d.validate(a);

        scan.close();
    }
}
