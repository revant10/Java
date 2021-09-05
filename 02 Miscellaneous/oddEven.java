// Importing Scanner class
import java.util.Scanner;

class oddEven
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = scan.nextInt();

        if(n % 2 == 0)
        {
            System.out.println(n + " is an Even Number");
        }
        else
        {
            System.out.println(n + " is a Odd Number");
        }

        scan.close();
    }
}