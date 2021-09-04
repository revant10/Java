// Normal Import
import java.lang.Math.*;

class WithoutStatic
{
    public static void main(String[] args)
    {
        
        double r = 5.5;

        // Here we cannot directly use PI without
        // 'Math.' prefix
        double area = Math.PI * r * r;

        System.out.println("Radius of Circle: " + r);
        System.out.println("Areaof Circle: " + area);
    }
}