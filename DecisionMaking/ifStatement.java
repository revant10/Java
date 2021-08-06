////Importing the Scanner class
import java .util.Scanner;

class ifStatement
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Simple if statement
        System.out.println("Enter an Integer less than 20");
        int n = scan.nextInt();
        if (n > 20)
        {
            System.out.println("Number is greater than 20.");
        }
        
        scan.close();
    }
}
