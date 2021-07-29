public class array2
{
    public static void main(String[] args)
    {
        int a[][] = new int[3][3];
        int c = 0;

        // Putting Values in 2D array

        // First loop for rows
        for(int i = 0; i < 3; i++)
        {
            // Second loop fo columns
            for(int j = 0; j < 3; j++)
            {
                a[i][j] = c;
                c++;
            }
        }

        // Displaying 2D array
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(a[i][j] +  "  ");
            }
            System.out.println();
        }
    }
}