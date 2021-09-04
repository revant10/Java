// Static Import
import static java.lang.Math.*;

class WithStatic
{
    public static void main(String[] args)
    {
        
        double r = 5.5;

        // As we have imported package as static
        // we can directly use PI without
        // 'Math.' prefix
        double area = PI * r * r;

        System.out.println("Radius of Circle: " + r);
        System.out.println("Areaof Circle: " + area);
    }
}