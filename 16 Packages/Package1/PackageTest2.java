import package1.ClassA;
import package2.*;

public class PackageTest2
{
    public static void main(String[] args)
    {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();

        objA.displayA();
        objB.displayB();
    }
}
