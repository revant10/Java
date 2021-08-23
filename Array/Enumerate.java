public class Enumerate
{
    // 
    enum Days { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday }

    private static void weekend(Days d)
    {
        if (d.equals(Days.Sunday))
        {
            System.out.println(d + " is Holiday.");
        }
        else
        {
            System.out.println(d + " is Workingday.");
        }
    }
    public static void main(String[] args)
    {
        for (Days d: Days.values())
        {
            weekend(d);
        }
    }
}