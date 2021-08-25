// Dynamic Method Dispatch

// It is used to implement runtime polymorphism.
// In the following example the object is of
// type Super but it has Sub's reference.


// A super class
class Super
{
    public void method()
    {
        System.out.println("A Super method...");
    }
}


// A sub class
class Sub extends Super
{
    public void method()
    {
        System.out.println("A Sub method...");
    }
}

public class DynamicDispatch
{
    public static void main(String[] args)
    {
        //Sub's object reference assigned Super type
        Super A = new Sub();

        A.method();
        // Sub's method() will be called at runtime.
    }
}