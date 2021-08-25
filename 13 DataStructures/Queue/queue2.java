// Deque means Double Ended Queue
// Elements can be added as well as removed from bot the ends

// Importing Deque class
import java.util.Deque;
import java.util.ArrayDeque;

public class queue2
{
    public static void main(String[] args)
    {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        
        // Adding elemets to empty deque
        dq.offer(1) ;
        dq.offer(2);
        dq.offer(3);

        // Displaying queue elements
        System.out.println("Initial Queue:");
        System.out.println(dq);

        // Adding element from front end
        dq.offerFirst(0);
        System.out.println("After adding element from front end:");
        System.out.println(dq);

        // Adding elements from the rear end
        dq.offer(4);
        System.out.println("After adding element from rear end:");
        System.out.println(dq);

        // Removing element from front end
        dq.poll();
        System.out.println("After removing element from front end:");
        System.out.println(dq);

        // Removing element from rear end
        dq.pollLast();
        System.out.println("After adding element from rear end:");
        System.out.println(dq);
    }
}
