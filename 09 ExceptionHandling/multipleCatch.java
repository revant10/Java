public class multipleCatch
{
    public static void main(String[] args)
    {
        int a[] = {5, 10};
        int b = 5;

        try
        {
            int  x = a[2] / b - a[1];
        }

        // Catch 1
        catch(ArithmeticException e)
        {
            System.out.println("Division by Zero.");
        }

        // Catch 2
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Error.");
        }

        // Catch 3
        catch(ArrayStoreException e)
        {
            System.out.println("Wrong Data Type.");
        }

        int y = a[1] / a[0];
        System.out.println("y = " + y);
    }
}

// After executing this program 2 catch will handle exception:
// "Array Index Error", because a[2] doesn't exists
// and rest other exceptions will be skiped