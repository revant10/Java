// Importing Stack class
import java.util.Stack;

public class stack1
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
            System.out.println("Elements in Stack: " + st);
        }

        // Removing elemnt from Stack
        // In stack the last element inserted is removed first.
        if(result = st.empty())
        {
            System.out.println("Stack empty? " + result);
        }
        else
        {
            st.pop();
            System.out.println("Elements in Stack: " + st);
        }
    }
}