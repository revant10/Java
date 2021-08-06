class Finally
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        try
        {
            System.out.println("This is from Try block: " + (a / b));
        }
        
        catch(Exception e)
        {
            System.out.print("This is from Catch block: ");
            System.out.println("Error: " + e);
        }

        finally
        {
            System.out.print("This is from Finally block: ");
            System.out.println("This block will be executed in both the cases..");
        }
    }
}