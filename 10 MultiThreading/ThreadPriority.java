class TP1 extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("\tFrom Thread TP1: i = " + i);
        }
        System.out.println("Exit from TP1.");
    }
}

class TP2 extends Thread
{
    public void run()
    {
        for(int j = 1; j <= 5; j++)
        {
            System.out.println("\tFrom Thread B: j = " + j);
        }
        System.out.println("Exit from TP2.");
    }
}

class TP3 extends Thread
{
    public void run()
    {
        for(int k = 1; k <= 5; k++)
        {
            System.out.println("\tFrom Thread C: k = " + k);
        }
        System.out.println("Exit from TP3.");
    }
}

public class ThreadPriority
{
    public static void main(String[] args)
    {
        TP1 t1 = new TP1();
        TP2 t2 = new TP2();
        TP3 t3 = new TP3();

        // Setting the priority of the threads
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(t1.getPriority() + 1);
        t1.setPriority(Thread.MIN_PRIORITY);

        // Starting threads
        System.out.println("Starting Thread TP1.");
        t1.start();

        System.out.println("Starting Thread TP2.");
        t2.start();

        System.out.println("Starting Thread TP3.");
        t3.start();

        System.out.println("End of main Thread");
    }
}