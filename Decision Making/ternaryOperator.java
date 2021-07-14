// Importing Scanner class
import java.util.Scanner;

class ternaryOperator
{    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an Integer:");
        int n = scan.nextInt();

        // Ternary Operator
        String output = (n %2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(n + " is " + output);

        //Close Scanner
        scan.close();
    }
}
