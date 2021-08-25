// Importing Stack class
import java.util.Stack;

public class stack2
{
    public static void main(String[] args)
    {
        // Initializing a Stack object of type Integer
        Stack<Integer> st = new Stack<>();

        // Check if Stack is empty
        boolean result = st.empty();  
        System.out.println("Stack empty? " + result); 

        // Inserting elements in Stack
        st.push(11);
        st.push(10);
        st.push(24);

        // Check if Stack is empty
        if(result = st.empty())
        {
            System.out.println("Stack empty? " + result);
        }
        else
        {
            // Printing the elements in Stack
            // Top to bottom
            st.forEach(n -> {System.out.println(n);}); 
        }

        // Search an element
        // The position is counted from bottom of the stack
        if(result = st.empty())
        {
            System.out.println("Stack empty? " + result);
        }
        else
        {
            int location = st.search(11);  
            System.out.println("Location of 11: " + location);
        }
    }
}