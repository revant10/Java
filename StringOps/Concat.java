public class Concat
{
    public static void main(String[] args)
    {
        // Concat does not attach the whitespace between
        // the strings.`

        // Implemntation 1
        String s1 = "Hello";
        System.out.println("String s1: " + s1);

        String s2 = "World";
        System.out.println("String s2: " + s2);

        String s = s1.concat(s2);
        System.out.println("String s: " + s);


        // Implementation 2
        s = s1.concat(" Learner!");
        System.out.println("String s: " + s);
    }
}