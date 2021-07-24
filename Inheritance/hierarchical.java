class Peri
{
    void display()
    {
        System.out.print("The parameter of ");
    }
}

class Rect extends Peri
{
    float p;
    Rect(float l, float b)
    {
        p = (l + l + b + b);
    }
    void display()
    {
        super.display();
        System.out.println("Rectangle: " + p);
    }
}

class Square extends Peri
{
    float p;
    Square(float s)
    {
        p = (4 * s);
    }
    void display()
    {
        super.display();
        System.out.println("Square: " + p);
    }
}

class Triangle extends Peri
{
    float p;
    Triangle(float a, float b, float c)
    {
        p = (a + b + c);
    }
    void display()
    {
        super.display();
        System.out.println("Triangle: " + p);
    }
}

class hierarchical
{
    public static void main(String[] args)
    {
        Rect r = new Rect(11, 10);
        Square s = new Square(17);
        Triangle t = new Triangle(9, 7, 3);
        r.display();
        s.display();
        t.display();
    }
}