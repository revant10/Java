public class AlphabeticalOrder
{
    public static void main(String[] args)
    {
        String name[] = {"Ruby", "Java", "C", "Python", ".NET"};
        int i, j;
        int size = name.length;
        String temp = null;

        // Before String
        System.out.println("Before Sortig: ");
        for (i = 0; i < size; i++)
        {
            System.out.println(name[i]);
        }

        // Sorting names
        for (i = 0; i < size + 1; i ++)
        {
            for (j = i +1; j < size; j++)
            {
                if (name[j].compareTo(name[i]) < 0)
                {
                    // Swaping the strings
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println();

        // After Sorting
        System.out.println("After Sortig: ");
        for (i = 0; i < size; i++)
        {
            System.out.println(name[i]);
        }
    }
}