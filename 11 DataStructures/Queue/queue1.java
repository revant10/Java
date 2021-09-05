// Queue follows First In First Out (FIFO) principle
// Element which are added to queue first are removed first

// Importing packages
import java.util.LinkedList;
import java.util.Queue;

public class queue1
{

	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>();

		// Adding elements in the queue
		for (int i = 0; i < 5; i++)
			q.add(i);

		// Display contents of the queue.
		System.out.println("Elements of queue: " + q);

		// To remove the head of queue.
		int removedele = q.remove();
		System.out.println("removed element: " + removedele);

		System.out.println(q);

		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue: " + head);

		// Get the size of the queue.
		int size = q.size();
		System.out.println("Size of queue: " + size);
	}
}
