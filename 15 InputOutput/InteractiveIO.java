// Importing packages
import java.io.*;
import java.util.*;

public class InteractiveIO
{
    static BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException
    {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("inventory.txt"));

        // Reading from console
        System.out.print("Enter code number: ");
        st = new StringTokenizer(bin.readLine());
        int code = Integer.parseInt(st.nextToken());
        System.out.print("Enter number of Items: ");
        st = new StringTokenizer(bin.readLine());
        int items = Integer.parseInt(st.nextToken());
        System.out.print("Enter cost: ");
        st = new StringTokenizer(bin.readLine());
        double cost = Double.parseDouble(st.nextToken());

        // Writing to file
        dos.writeInt(code);
        dos.writeInt(items);
        dos.writeDouble(cost);
        dos.close();

        // Processing data from file
        DataInputStream dis = new DataInputStream(new FileInputStream("inventory.txt"));
        int codeNumber = dis.readInt();
        int totalItems = dis.readInt();
        double totalCost = dis.readDouble();
        dis.close();

        // Writing to console
        System.out.println();
        System.out.println("Code Number: " + codeNumber);
        System.out.println("Total Items: " + totalItems);
        System.out.println("Total Cost: " + totalCost);

    }
}