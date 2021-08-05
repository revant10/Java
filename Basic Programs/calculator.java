// In=mporting Scanner class
import java.util.Scanner;

class calculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int c;

        while(true)
        {
            System.out.println();
            System.out.println("/**** Calculator ****\\");
            System.out.println();
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5 Quit");
            System.out.println();
            System.out.print("Please Enter your Choice: ");
            c = scan.nextInt();

            if (c == 5)
            {
                break;
            }
            else if( c < 1 || c > 5)
            {
                System.out.println("Invalid Opition");
            }
            else
            {
                System.out.println();
                System.out.print("Enter first Number: ");
                float n1 = scan.nextFloat();
                System.out.print("Enter second Number: ");
                float n2 = scan.nextFloat();
                switch(c)
                {
                    case 1: System.out.println(n1 + " + " + n2 + " = " + (n1 + n2)); break;
                    case 2: System.out.println(n1 + " - " + n2 + " = " + (n1 - n2)); break;
                    case 3: System.out.println(n1 + " * " + n2 + " = " + (n1 * n2)); break;
                    case 4: System.out.println(n1 + " / " + n2 + " = " + (n1 / n2)); break;
                    default: System.out.println("Invalid Opition");
                }
                System.out.println();
            }
        }

        // Close the Scanner
        scan.close();
    }
}