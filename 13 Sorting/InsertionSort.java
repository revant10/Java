// Insertion Sort
// Worst Complexity: n^2
// Average Complexity: n^2
// Best Complexity: n
// Space Complexity: 1

public class InsertionSort
{
    public static void main(String[] args)
    {
        int a[] = {16, 24, 3, 22, 11};
        int l = a.length;
        int i, j;

        // Original Array
        System.out.println("Original Array:");
        for (i = 0; i < l; i++)
        {
            System.out.println(a[i]);
        }

        // Sorting the Array using Insertion Sort method
        for (j = 1; j < l; j++)
        {  
            int key = a[j];  
            i = j-1;  
            while ( (i > -1) && ( a[i] > key ) )
            {  
                a[i+1] = a[i];  
                i--;  
            }  
            a[i+1] = key;  
        }

        // Sorted Array
        System.out.println("Sorted Array:");
        for (i = 0; i < l; i++)
        {
            System.out.println(a[i]);
        }
    }
}
