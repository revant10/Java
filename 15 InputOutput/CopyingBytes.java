// Importing IO package
import java.io.*;

public class CopyingBytes
{
    public static void main(String[] args) 
    {
        // Input, output files
        // Already Existing File
        File inFile = new File("input.txt");
        // If output file is absent a new file will be created
        // else the contents in the file will be overwritten
        File outFile = new File("copy.txt");
        FileReader ins = null;
        FileWriter outs = null;

        try
        {
            ins = new FileReader(inFile);
            outs = new FileWriter(outFile);

            int ch;
            while ((ch = ins.read()) != -1)
            {
                outs.write(ch);

            }
        }
        catch (IOException e)
        {
            System.out.println(e);
            System.exit(-1);
        }
        finally
        {
            try
            {
                ins.close();
                outs.close();
            }
            catch (IOException e) {}
        }
    }
}