import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Integer Number: ");
        int n = scan.nextInt();
        scan.close();
        
        if (n == 0 | n == 1)
        {
            System.out.println(n + " is neither Prime nor Composite");
        }
        else
        {
            int i;
            for (i = 2; i <= n - 1; i++)
            {
                if (n % i == 0)
                    break;
            }

            // here if the number is Prime then loop won't break
            // and 'i' will be equal to 'n', but if number is 
            // NOT prime then 'i' will not be equal to 'n'
            if (i == n)
                System.out.println(n + " is a Prime Number.");
            else
                System.out.println(n + " is NOT a Prime Number.");
        }
    }
}