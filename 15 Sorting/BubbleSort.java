// Bubble Sort
// Worst Complexity: n^2
// Average Complexity: n^2
// Best Complexity: n
// Space Complexity: 1

public class BubbleSort
{
    public static void main(String[] args)
    {
        int a[] = {16, 24, 3, 22, 11};
        int l = a.length;
        int i, j, temp;

        // Original Array
        System.out.println("Original Array:");
        for (i = 0; i < l; i++)
        {
            System.out.println(a[i]);
        }

        // Sorting the Array using Bubble Sort method
        for (i = 0; i < l-1; i++)
        {
            for (j = 0; j < l-i-1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    // If next element is less than current
                    // element swap the elements
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Sorted Array
        System.out.println("Sorted Array:");
        for (i = 0; i < l; i++)
        {
            System.out.println(a[i]);
        }
    }
}