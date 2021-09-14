// Importing IO package
import java.io.*;

// city.txt file before appending
// Mumbai
// Delhi
// Chennai
// Kolkota

public class Appending
{
    public static void main(String[] args) 
    {
        RandomAccessFile rFile;
        try
        {
            rFile = new RandomAccessFile("city.txt", "rw");
            rFile.seek(rFile.length()); // Moving cursor to End of File
            rFile.writeBytes("\nBanglore"); // Appending new city (Banglore)
            rFile.close(); // closing the file
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}