class array1
{
    public static void main(String[] args)
    {
        // Method 1 
        // Declaring and initializing array
        int a1[] = {1, 2, 3, 4, 5};
        
        // Displaying all the Elements of Array
        System.out.println("Array 1: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(a1[i]);
        }

        // Method 2
        // Declaring array
        int a2[] = new int[10];

        // Putting Elements in array
        for(int j = 0; j < 10; j++)
        {
            a2[j] = j+1;
        }

        // Displaying all the Elements of Array
        System.out.println("Array 2: ");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(a2[i]);
        }

        // Displaying element of array at specific position,
        // e.g. Element at index 7
        System.out.println("Element at index 7: " + a2[7]);
    }
}