public class Equals 
{
    public static void main(String[] args)
    {
        // Initializing Strings
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = "hello world";

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        // using equals()
        // Case Sensitive
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        // using equalsIgnoreCase()
        // It ignores case
        System.out.println("s1.equalsIgnoreCase(s2): " + s1.equalsIgnoreCase(s2));
        System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));
    }
}