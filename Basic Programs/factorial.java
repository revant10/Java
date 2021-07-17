// Importing Scanner class
import java.util.Scanner;

class factorial
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = scan.nextInt();
        
        if(n < 0)
        {
            System.out.println("Not Defined");
        }
        else if(n == 0)
        {
            System.out.println("Factorial of 0 : 1");
        }
        else
        {
            long f = 1;
            for(int i =1; i <= n; i++)
            {
                f = f * i;
            }
            System.out.println("Factorial of " + n + " : " + f);
        }
        scan.close();
    }
}