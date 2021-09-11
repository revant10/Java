// Importing IO package
import java.io.*;

public class WritingBytes
{
    public static void main(String[] args) 
    {
        // iniializing a byte array with file content
        byte cities[] = { 'D', 'E', 'L', 'H', 'I', '\n',
                            'M', 'U', 'M', 'B', 'A', 'I', 
                                '\n', 'C', 'H', 'E', 'N', 'N', 'A', 'I', '\n', 
                                    'K', 'O', 'L', 'K', 'O', 'T', 'A' };
                            
        // creating output file stream
        FileOutputStream outfile = null;
        try
        {
            // connecting out stream to file
            // during program execution of program
            // if output file is not present it will be created
            // else the previous content will be overwritten.
            outfile = new FileOutputStream("output.txt");

            // writing contents to file
            outfile.write(cities);

            // closing out stream
            outfile.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(-1);
        }

    }
}