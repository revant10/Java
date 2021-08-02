// Importing Scanner class
import java.util.Scanner;

class palindrome
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = scan.next();
        scan.close();
        String s1 = s.toUpperCase();
        String r = "";
        int l = s1.length();
        
        for(int i = (l-1); i >= 0; i--)
        {
            r = r + s1.charAt(i);
        }

        if(s1.equals(r))
        {
            System.out.println("String is Palindrome.");
        }
        else
        {
            System.out.println("String is NOT Palindrome.");
        }
    }
}