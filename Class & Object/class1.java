class Student1
{
    int id;
    String name, dept;

    void setData()
    {
        id = 1;
        name = "John Doe";
        dept = "IT";
    }

    void viewData()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
    }
}

class class1
{
    public static void main(String[] args)
    {
        Student1 s1 = new Student1();
        s1.setData();
        s1.viewData();
    }
}