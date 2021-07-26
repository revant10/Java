class A
{
    int id;
    void getData(int a)
    {
        this.id = a;
    }

    void showData()
    {
        System.out.println("ID: " + id);
    }
}

interface B
{
    int SSN = 1001;
    void display();
}

class C extends A implements B
{
    public void display()
    {
        System.out.println("SSN: " + SSN);
    }

    String n;

    void getData(int a, String b)
    {
        super.getData(a);
        this.n = b;
    }

    void showData()
    {
        super.showData();
        display();
        System.out.println("Name: " + n);
    }
}

class multipleIn
{
    public static void main(String[] args)
    {
        int id = 001;
        String name = "John Doe";
        C c = new C();
        c.getData(id, name);
        c.showData();
    }
}