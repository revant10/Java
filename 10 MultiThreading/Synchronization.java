// Pyramid class to draw pyramid.
class Pyramid
{
    // First try this and later comment line 5 and try line 6 by un-commenting it.
    void draw_pyramid(char ch)
    //synchronized void draw_pyramid(char ch)
    {
        for (int i = 0; i < 10; i += 2)
        {
            for (int k = (10 - i); k > 0; k -= 2)
            {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++)
            {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}

class S1 extends Thread
{
    Pyramid p;
    S1(Pyramid p)
    {
        this.p = p;
    }

    public void run()
    {
        p.draw_pyramid('*');
    }
}

class S2 extends Thread
{
    Pyramid p;
    S2(Pyramid p)
    {
        this.p = p;
    }

    public void run()
    {
        p.draw_pyramid('#');
    }
}

class Synchronization
{
    public static void main(String[] args)
    {
        Pyramid py = new Pyramid();
        S1 t1 = new S1(py);
        S2 t2 = new S2(py);
        t1.start();
        t2.start();
    }
}