package p1;

public class ClassX
{
    public void displayX()
    {
        System.out.println("From ClassX\nThis is a public class and is accessible outside the package.");
    }
}
 // This class is not accessible outside the package
class ClassY
{
    void displayY()
    {
        System.out.println("This is NOT a public class and is NOT accessible outside the package.");
    }
}