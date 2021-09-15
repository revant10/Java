// Importing IO package
import java.io.*;

public class RandomIO
{
    public static void main(String[] args) 
    {
        RandomAccessFile file = null;

        try
        {
            // If file is not present a new file will be created.
            file = new RandomAccessFile("random.txt", "rw");

            // Writing to file
            file.writeChar('X');
            file.writeInt(110);
            file.writeDouble(3.1412);

            // Moving back to initial position
            file.seek(0);

            // Reading from file
            System.out.println(file.readChar());
            System.out.println(file.readInt());
            System.out.println(file.readDouble());

            // Moving to second item and reading
            file.seek(2);
            System.out.println(file.readInt());

            // Appending a value to the end
            file.seek(file.length());
            file.writeBoolean(false);
            file.seek(3);
            System.out.println(file.readBoolean());

            // closing the file
            file.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}