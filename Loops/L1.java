// This program demonstrates Break, Continue, and Labeled loop and Jump usage

class L1
{
    public static void main(String[] args)
    {
        LOOP1 : for(int i = 1; i < 20; i++)
        {
            System.out.println(" ");
            if(i > 10)
                break;

            for(int j = 1; j < 100; j++)
            {
                System.out.print("*");
                if(j == i)
                    continue LOOP1;
            }
        }
        System.out.println("Terminated by Break");
    }
}