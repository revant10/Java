// Importing IO package
import java.io.*;

public class ReadingBytes
{
    public static void main(String[] args) 
    {
        // Creating an input file stream
        FileInputStream inFile = null;
        int b;
        try
        {
            // Connecting filesteram to required file
            inFile = new FileInputStream("input.txt");

            // Read & Display Data
            while ((b = inFile.read()) != -1)
            {
                System.out.print((char)b);
            }
            inFile.close();
        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
        }
    }
}