// Importing IO package
import java.io.*;

public class SequenceBuffer
{
    public static void main(String[] args) throws IOException
    {
        // File Streams
        FileInputStream file1 = null;
        FileInputStream file2 = null;

        // File 3 to store content
        SequenceInputStream file3 = null;

        file1 = new FileInputStream("file1.txt");
        file2 = new FileInputStream("file2.txt");

        // Concatenating file1 and file2 and write it to file3
        file3 = new SequenceInputStream(file1, file2);

        // Creating Input and output buffer
        BufferedInputStream inBuffer = new BufferedInputStream(file3);
        // The output will be visible on the screen
        BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);

        // Read and write till the end of buffers
        int ch;
        while((ch = inBuffer.read())!= -1)
        {
            outBuffer.write((char) ch);
        }
        
        // Closing Buffers
        inBuffer.close();
        outBuffer.close();

        // Closing the files
        file1.close();
        file2.close();
        file3.close();
    }
}