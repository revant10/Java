class MathOperation
{
    // static method
    static float add(float x, float y)
    {
        return x + y;
    }

    // static method
    static float subtract(float x, float y)
    {
        return x - y;
    }
}

class StaticMembers
{
    public static void main(String[] args)
    {
        // Calling static method from MathOperation class
        float a = MathOperation.add(11, 16);
        float b = MathOperation.subtract(10, 7);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}