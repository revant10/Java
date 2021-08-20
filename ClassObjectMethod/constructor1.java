class c1
{
    c1()
    {
        System.out.println("This method is invoked as soon as Object is initialized!");
    }
}

class constructor1
{
    public static void main(String [] args)
    {
        //As sson as the object is initialized the c1() method will be invoked
        c1 c = new c1();
    }
}