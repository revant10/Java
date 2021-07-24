// Method Overloading
// Methods in same class with same name, but different parameters.

class Area
{
    double pi = 3.14;

    // Here the name of the methods is same i.e. area;
    // but they both take different number of parameters.

    void area(float r)
    {
        double circleArea = pi * r * r;
        System.out.println("Area of Circle: " + circleArea);
    }

    void area(float x, float y)
    {
        float rectArea = x * y;
        System.out.println("Area of Rectangle: " + rectArea);
    }
}

class methodOverload
{
    public static void main(String[] args)
    {
        Area a = new Area();

        // Passing single parameter.
        a.area(5);

        // Passing two parameters.
        a.area(5, 10);
    }
}
