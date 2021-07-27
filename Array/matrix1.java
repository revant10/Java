import java.util.Scanner;

class matrix1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int d[][] = new int[3][3];
        int i;
        int j;

        // Getting values for Matrix A
        System.out.println("Enter values for Matrix A - 3 X 3");
        for(i = 0; i < 3; i++)
        {
            System.out.println("Row : " + (i + 1));
            for(j = 0; j < 3; j++)
            {
                a[i][j] = scan.nextInt();
            }
        }

        // Getting values for Matrix B
        System.out.println("Enter values for Matrix B - 3 X 3");
        for(i = 0; i < 3; i++)
        {
            System.out.println("Row : " + (i + 1));
            for(j = 0; j < 3; j++)
            {
                b[i][j] = scan.nextInt();
            }
        }

        // Calculation Part
        for(i = 0; i < 3; i++)
        {
            System.out.println("Row 1:");
            for(j = 0; j < 3; j++)
            {
                // Addition
                c[i][j] = a[i][j] + b[i][j];

                // Subtraction
                d[i][j] = a[i][j] - b[i][j];
            }
        }

        // Displaying Addition
        System.out.println("Matrix A + Matrix B:");
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        // Displaying Subtraction
        System.out.println("Matrix A - Matrix B:");
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}