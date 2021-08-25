public class StringManipulation
{
    public static void main(String[] args)
    {
        // Original string
        StringBuffer str = new StringBuffer("Object Language");
        System.out.println("Original String: " + str);
        System.out.println("Length of String:" + str.length());

        // Accessing characters in string
        for(int i  = 0; i < str.length(); i++)
        {
            int p = i + 1;
            System.out.println("Character at position " + p + ": " + str.charAt(i));
        }

        // Inserting a string in the middle of the string
        String aString = new String(str.toString());
        int pos  = aString.indexOf(" Language");
        str.insert(pos, " Oriented ");
        System.out.println("Modified String: " + str);

        // Modifying characters
        str.setCharAt(6, '-');
        System.out.println("String now: " + str);

        // Appending string at the end
        str.append(" improves security.");
        System.out.println("Appended string: " + str);
    }
}
