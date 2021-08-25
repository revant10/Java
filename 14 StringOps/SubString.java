public class SubString
{
    public static void main(String[] args)
    {
        // Initializing a string
        String s = "Happy Independence Day!!";
        System.out.println("String s: " + s);

        // Getting sub string from a string
        String s1 = s.substring(5);
        System.out.println("s.substring(5): " + s1);

        String s2 = s.substring(6, 19);
        System.out.println("s.substring(6, 19): " + s2);
    }
}
