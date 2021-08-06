// importing Scanner class.
import java.util.Scanner;

class fibonacci
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out .print("No. of terms for Fibonacci Series: ");
        int n = scan.nextInt();

        int t1 = 0, t2 = 1, t3;
        if(n <= 0)
        {
            System.out.println("---");
        }
        else if(n == 1)
        {
            System.out.println(t1);
        }
        else if(n == 2)
        {
            System.out.println(t1 + " " + t2);
        }
        else
        {
            System.out.print(t1 + " " + t2);
            int i = 1;

            // n-2 because first two terms are already printed
            while(i <= n-2)
            {
                t3 = t1 + t2;
                System.out.print(" " + t3);
                t1 = t2;
                t2 = t3;
                i++;
            }
        }

        // CLose Scanner class
        scan.close();
    }
}