//Importing the Scanner class
import java .util.Scanner;

public class ifElse
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // if-else
        System.out.print("Enter your Age: ");
        int age = scan.nextInt();
        
        if(age > 18)
        {
            System.out.println("You are eligble for Driving License!");
        }
        else
        {
            System.out.println("You are NOT eligble for Driving License!");
        }

        // Close Scanner
        scan.close();
    }
}
