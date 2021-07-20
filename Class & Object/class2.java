// Importing Scanner class
import java.util.Scanner;

class Student2
{
    int id;
    String name, dept;

    void setData(int a, String b, String c)
    {
        id = a;
        name = b;
        dept = c;
    }

    void viewData()
    {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
    }
}

class class2
{
    public static void main(String[] args)
    {
        int id;
        String name, dept;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        id = scan.nextInt();
        System.out.print("Enter your Name: ");
        name = scan.next();
        System.out.print("Enter your Department: ");
        dept = scan.next();
        
        // Close Scanner
        scan.close();
        
        Student2 s1 = new Student2();
        s1.setData(id, name, dept);
        s1.viewData();
    }
}