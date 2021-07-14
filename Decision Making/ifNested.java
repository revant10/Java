class ifNested
{
    public static void main(String[] args)
    {
        //Change the values to see how the output changes.
        int n1 = 20;  
        int n2 = 80;    

        if(n1 >= 18)
        {
            System.out.println("First condition Passed!");    
            if(n2 > 50)
            {  
                System.out.println("Scond condition Passed!");  
            }    
        }  
    }    
}