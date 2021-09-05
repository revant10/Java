// Selection Sort
// Worst Complexity: n^2
// Average Complexity: n^2
// Best Complexity: n^2
// Space Complexity: 1

public class SelectionSort
{
    public static void main(String[] args)
    {
        int a[] = {16, 24, 3, 22, 11};
        int l = a.length;
        int i, j, temp, minIndex;

        // Original Array
        System.out.println("Original Array:");
        for (i = 0; i < l; i++)
        {
            System.out.println(a[i]);
        }

        // Sorting the Array using Bubble Sort method
        for (i = 0; i < l-1; i++)
        {
            minIndex = i;
            for (j = i+1; j < l; j++)
            {
                // find minimum element
                if (a[j] < a[minIndex])
                {
                    minIndex = j;
                }

                // Swap mininum element
                // with first element
                temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
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