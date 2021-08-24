public class VarArgs
{
    
    // Using Variable Arguments we can pass many parameter to a function
    // without explicitly defining it
    static void VarFun(String... person)
    {
        for (String name: person)
        {
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args)
    {
        VarFun("Black Widow", "Ironman", "Captain America", "Hulk", "Hawk Eye", "Thor");
    }
}