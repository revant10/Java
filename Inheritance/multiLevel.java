// Parent Class
class A
{
    void display()
    {
        System.out.println("This is Class A.");
    }
}

// Child Class
class B extends A
{
    void display()
    {
        super.display();
        System.out.println("This is Class B.");
    }
}

// Grand-Child Class
class C extends B
{
    void display()
    {
        super.display();
        System.out.println("This is Class C.");
    }
}

public class multiLevel
{
    public static void main(String[] args)
    {
        C c = new C();
         c.display();
    }
}
