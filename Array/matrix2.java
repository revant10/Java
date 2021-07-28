// Importing Scanner class
import java.util.Scanner;

class matrix2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // For matrix multiplication, the condition is that for
        // Matrix 1 (i X j) & Matrix 2 (a X b)
        // j should be equal to a i.e. j == a; for multiplication
        // In words: No. of columns of Matrix 1 should be equal to No. rows in Matrix B

        // Taking inputs
        System.out.print("No. of rows for Matrix A: ");
        int r1 = scan.nextInt();
        System.out.print("No. of columns for Matrix A: ");
        int c1 = scan.nextInt();
        System.out.print("No. of rows for Matrix B: ");
        int r2 = scan.nextInt();
        System.out.print("No. of columns for Matrix A: ");
        int c2 = scan.nextInt();

        if(c1 != r2)
        {
            System.out.print("Matrix Multiplication not Possible!");
        }
        else
        {
            int a[][] = new int[r1][c1];
            int b[][] = new int[r2][c2];
            int c[][] = new int[r1][c2];
            int i, j, k;

            // Getting values for Matrix A
            System.out.println("Enter values for Matrix A:");
            for(i = 0; i < r1; i++)
            {
                System.out.println("Row : " + (i + 1));
                for(j = 0; j < c1; j++)
                {
                    a[i][j] = scan.nextInt();
                }
            }

            // Getting values for Matrix B
            System.out.println("Enter values for Matrix B:");
            for(i = 0; i < r2; i++)
            {
                System.out.println("Row : " + (i + 1));
                for(j = 0; j < c2; j++)
                {
                    b[i][j] = scan.nextInt();
                }
            }

            // Calculations
            for(i = 0; i < r1; i++)
            {
                for(j = 0; j < c2; j++)
                {
                    c[i][j] = 0;
                    for(k = 0; k < r2; k++)
                    {
                        c[i][j] += a[i][k]*b[k][j];
                    }
                }
            }

            // Display Results
            for(i = 0; i < r1; i++)
            {
                for(j = 0; j < c2; j++)
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        scan.close();
    }
}