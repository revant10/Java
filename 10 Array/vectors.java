// Vector is a dynamic array in wich can hold object of any type and any number.
// The objects do not have to be homogenous. 

// Importing Vector class
import java.util.*;

class vectors
{
    // Try passing: Java C++ FORTRAN Python 123
    // in arguments
    public static void main(String[] args)
    {
        // Initialising a String Vector
        Vector<String> list = new Vector<>();

        // Getting the number of args
        int length = args.length;

        // Feeding the vector with elements
        for(int i = 0; i < length; i++)
        {
            list.addElement(args[i]);
        }

        // Inserting an element in between other elements
        list.insertElementAt("COBOL", 2);
        
        int size = list.size();

        // Initialising a String array
        String listArray[] = new String[size];

        // Copying vector elements to String Array
        list.copyInto(listArray);

        System.out.println("List of Languages: ");
        for(int i = 0; i < size; i++)
        {
            System.out.println(listArray[i]);
        }
    }
}