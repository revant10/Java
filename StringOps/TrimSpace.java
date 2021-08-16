// trim() removes white-spaces from start and end of the string.

public class TrimSpace
{
    public static void main(String[] args)
    {
        // The underscore '_' is just for representation of
        // whitespaces in print statement.
        System.out.println("!!!...The underscores in string is for representing whitespaces...!!!");

        String s1 = "       Hello World";
        System.out.println("s1: ________Hello World");

        String s2 = "Hello World         ";
        System.out.println("s2: Hello World________");

        String s3 = "       Hello World     ";
        System.out.println("s3: ________Hello World________");

        // Applying trim()
        System.out.println("After applying trim():");
        System.out.println("s1: " + s1.trim());
        System.out.println("s2: " + s2.trim());
        System.out.println("s3: " + s3.trim());
    }
}