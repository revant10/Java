public class doWhileLoop
{
    public static void main(String[] args)
    {
        int i = 7;

        // Even in condition is false the loop wiil
        // be executed atleast once.
        do
        {
            System.out.println(i);
            i++;
        }
        while(i < 5);
    }
}
