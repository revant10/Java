class twoD
{
    // this is a parent class
    
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

class threeD extends twoD
{
    // This is the child class
    
    int height;
    threeD(int x, int y, int z)
    {
        // super keyword is used to pass to the parent class.
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