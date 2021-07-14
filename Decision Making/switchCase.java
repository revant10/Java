// Importing Scanner class
import java.util.Scanner;

class switchCase
{    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Integer:");
        int n1 = scan.nextInt();
        System.out.println("Enter Second Integer:");
        int n2 = scan.nextInt();

        System.out.println("Which operation do you want to perform?");
        System.out.println("1: Additon");
        System.out.println("2: Subtraction");
        System.out.print("Enter your choice number: ");
        int c = scan.nextInt();

        switch(c)
        {
            case 1: System.out.println("Result: " + (n1 + n2)); 
                    break;
            case 2: System.out.println("Result: " + (n1 - n2)); 
                    break;
            // Default output
            default: System.out.println("Invalid Option");
        }

        //Close Scanner
        scan.close();
    }
}
