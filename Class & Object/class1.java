class Student
{
    int id;
    String name, dept;

    void setData()
    {
        id = 1;
        name = "John Doe";
        dept = "IT";
    }

    void displayData()
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
        Student s1 = new Student();
        s1.setData();
        s1.displayData();
    }
}