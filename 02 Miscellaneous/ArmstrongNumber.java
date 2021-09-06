// Armstrong number (3 digit)
// It is a number that is equal to the sum of cubes of its digits.

import java.util.Scanner;

public class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int p, sum = 0;

        System.out.println("Enter a 3 digit number");
        int n = scan.nextInt();
        int m = n;

        while (n != 0) 
        {
            p = n % 10;
            sum = sum + (p * p * p);
            n = n / 10;
        }

        if (m == sum)
            System.out.println(m + " is an Armstrong Number.");
        else
            System.out.println(m + " is NOT an Armstrong Number.");

        scan.close();
    }
}
