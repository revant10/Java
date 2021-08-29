// To get Thread's ID: Thread.currentThread().getId()
// To get Thread's Priority: Thread.currentThread().getPriority()

class TD1 extends Thread
{
    public void run()
    {
        System.out.println("This is Thread TD1\t Thread ID: " 
            + Thread.currentThread().getId() + "\t Thread Priority: " 
                + Thread.currentThread().getPriority());
    }
}

class TD2 extends Thread
{
    public void run()
    {
        System.out.println("This is Thread TD2\t Thread ID: " 
            + Thread.currentThread().getId() + "\t Thread Priority: " 
                + Thread.currentThread().getPriority());
    }
}

class TD3 extends Thread
{
    public void run()
    {
        System.out.println("This is Thread TD3\t Thread ID: " 
            + Thread.currentThread().getId() + "\t Thread Priority: " 
                + Thread.currentThread().getPriority());
    }
}

public class ThreadDetails
{
    public static void main(String[] args)
    {
        TD1 t1 = new TD1();
        TD2 t2 = new TD2();
        TD3 t3 = new TD3();

        // Setting the Thread's priority
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        System.out.println("\nThis the Main Thread\t Thread ID: " 
            + Thread.currentThread().getId() + "\t Thread Priority: " 
                + Thread.currentThread().getPriority() + "\n");

        System.out.println("Calling other threads in sequence A -> B-> C. \n");

        t1.start();
        t2.start();
        t3.start();
    }
}