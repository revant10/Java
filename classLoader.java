class classLoader
{
    public static void main(String[] args)
    {
        // String class is loaded by bootstrap loader, and
        // bootstrap loader is not Java object, hence null
        System.out.println("Classloader for String: " + String.class.getClassLoader());

        // Test class is loaded by Application loader
        System.out.println("Classloader for classLoader (this main class): " + classLoader.class.getClassLoader());
    }   
}
