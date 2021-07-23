// Super/Parent Class
class twoD
{
    int length, breadth;

    twoD(int x, int y)
    {
        length = x;
        breadth = y;
    }

    int area()
    {
        return (length * breadth);
    }
}

// Child/Sub Class
class threeD extends twoD
{
    int height;
    threeD(int x, int y, int z)
    {
        // super keyword is used to invoke constructor of super-parent class.
        super (x , y);
        height = z;
    }

    int volume()
    {
        return (length * breadth * height);
    }
}

class singleIn
{
    public static void main(String[] args)
    {
        threeD d = new threeD(10, 10, 5);
        int a = d.area();
        int v = d.volume();
        System.out.println("Area: " + a);
        System.out.println("Volume: " + v);
    }
}