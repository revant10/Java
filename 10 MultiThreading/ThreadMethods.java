// Yield method
// It can stop the currently executing thread and 
// will give a chance to other waiting threads of the same priority.
// If in case there are no waiting threads or if all the waiting 
// threads have low priority then the same thread will continue its execution.
class A extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            if(i == 1) yield();
            System.out.println("\tFrom Thread A: i = " + i);
        }
        System.out.println("Exit from A.");
    }
}


// Stop Method
// It will terminate current thread even before
// the end of the run()
// It is deprcated.
class B extends Thread
{
    public void run()
    {
        for(int j = 1; j <= 5; j++)
        {
            System.out.println("\tFrom Thread B: j = " + j);
            // stop() method is depreceated
            //if(j == 3) 
            //    stop();
            
        }
        System.out.println("Exit from B.");
    }
}


// Sleep Method
// As the name says, the method will sleep for 
// the given time period (** in miliseconds)
class C extends Thread
{
    public void run()
    {
        for(int k = 1; k <= 5; k++)
        {
            System.out.println("\tFrom Thread C: k = " + k);
            if(k == 1)
                try { sleep(1000); }
                catch (Exception e){ }
        }
        System.out.println("Exit from C.");
    }
}


// Main Class
public class ThreadMethods
{
    public static void main(String[] args)
    {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        System.out.println("Start Thread A.");
        threadA.start();

        System.out.println("Start Thread B.");
        threadB.start();

        System.out.println("Start Thread C.");
        threadC.start();
        
        System.out.println("End of Main Thread.");
    }
}